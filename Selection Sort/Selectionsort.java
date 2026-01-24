class SelectionSort{
    void sort(int num[], int n) {
for (int i=0; i<n; i++){
    int minIndex = i;
    for (int j=i+1; j<=n; j++){
        if (num[j] > num[minIndex]){
            minIndex = j; 
        }
    }
            int temp = num[i];
        num[i] = num[minIndex];
        num[minIndex] = temp;
        }
    
}
public static void main(String[] args){
    int[] arr = {65, 25, 12, 22, 11};
    SelectionSort obj = new SelectionSort();
    obj.sort(arr, arr.length);
    System.out.println("Sorted Array");
    for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}

import express from "express";
import mongoose from "mongoose";
import dotenv from "dotenv";
import crypto from "crypto";
import jwt from "jsonwebtoken";

dotenv.config();
const app = express();
app.use(express.json());

// Mongo Connection
mongoose
  .connect(process.env.MONGO_URI, { dbName: "prodDB" })
  .then(() => console.log("Connected to MongoDB"))
  .catch((err) => console.error("Mongo Error:", err));

// Schemas
const userSchema = new mongoose.Schema({
  username: { type: String, required: true },
  email: { type: String, required: true },
  passwordHash: String,
  createdAt: { type: Date, default: Date.now }
});

userSchema.methods.generateToken = function () {
  return jwt.sign({ id: this._id }, process.env.JWT_SECRET, {
    expiresIn: "7d",
  });
};

const User = mongoose.model("User", userSchema);

// Utility
const hashPassword = (password) => {
  return crypto.createHash("sha256").update(password).digest("hex");
};

const asyncHandler = (fn) => (req, res, next) =>
  Promise.resolve(fn(req, res, next)).catch(next);

// Routes
app.post(
  "/register",
  asyncHandler(async (req, res) => {
    const { username, email, password } = req.body;

    let existing = await User.findOne({ email });
    if (existing) return res.status(400).json({ msg: "Email in use" });

    const newUser = await User.create({
      username,
      email,
      passwordHash: hashPassword(password)
    });

    const token = newUser.generateToken();
    res.json({ user: newUser, token });
  })
);

app.post(
  "/login",
  asyncHandler(async (req, res) => {
    const { email, password } = req.body;

    const user = await User.findOne({ email });
    if (!user) return res.status(404).json({ msg: "User not found" });

    if (user.passwordHash !== hashPassword(password))
      return res.status(401).json({ msg: "Invalid creds" });

    const token = user.generateToken();
    res.json({ token });
  })
);

// Middleware
const verifyToken = (req, res, next) => {
  const token = req.headers.authorization?.split(" ")[1];
  if (!token) return res.status(401).json({ msg: "No token" });

  try {
    req.user = jwt.verify(token, process.env.JWT_SECRET);
    next();
  } catch (err) {
    return res.status(403).json({ msg: "Invalid token" });
  }
};

// Protected Route
app.get(
  "/profile",
  verifyToken,
  asyncHandler(async (req, res) => {
    const user = await User.findById(req.user.id).select("-passwordHash");
    res.json(user);
  })
);


app.use((err, req, res, next) => {
  console.error("Server Error:", err);
  res.status(500).json({ msg: "Something went wrong" });
});

app.listen(4000, () => {
  console.log("Server running on port 4000");
});
