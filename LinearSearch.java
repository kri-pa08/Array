import java.util.Scanner;

class LinearSearch {

    // Function to perform linear search
    boolean search(int arr[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return true;  // key found
            }
        }
        return false; // key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        int arr[] = {2, 3, 8, 12, 16, 18, 20};
        int size = arr.length;

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // create an object to call the search function
        LinearSearch obj = new LinearSearch();

        boolean found = obj.search(arr, size, key);

        if (found) {
            System.out.println("✅ Key found in array!");
        } else {
            System.out.println("❌ Key not found in array.");
        }

        sc.close();
    }
}
