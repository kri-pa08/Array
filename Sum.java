import java.util.Scanner;

class ArraySum {

    // Function to calculate sum of array elements
    static int findSum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the sum function
        int total = findSum(arr, n);

        // Displaying result
        System.out.println("Sum of array elements = " + total);

        sc.close();
    }
}
