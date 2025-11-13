import java.util.Scanner;

class BinarySearch {
    int binarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid; // Return index, not value
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch obj = new BinarySearch();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        int result = obj.binarySearch(arr, arr.length, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
