class MaxMin {

    // Function to find the minimum number in the array
    int getMin(int num[], int n) {
        int min = Integer.MAX_VALUE; // start with the largest possible integer

        for (int i = 0; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        return min;
    }

    // Function to find the maximum number in the array
    int getMax(int num[], int n) {
        int max = Integer.MIN_VALUE; // start with the smallest possible integer

        for (int i = 0; i < n; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int num[] = {3, 5, 1, 9, 2, 8};
        int n = num.length;

        MaxMin obj = new MaxMin();

        int min = obj.getMin(num, n);
        int max = obj.getMax(num, n);

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}

