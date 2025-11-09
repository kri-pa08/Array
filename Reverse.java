import java.util.Scanner;

class ReverseArray {

    // Function to reverse the array
    void reverse(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Function to print the array
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseArray obj = new ReverseArray();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array:");
        obj.printArray(arr, n);

        obj.reverse(arr, n);

        System.out.println("Reversed array:");
        obj.printArray(arr, n);

        sc.close();
    }
}

