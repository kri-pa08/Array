//Search in a rotated sorted array
import java.util.Scanner;
class Rotated{
    int pivotElement(int arr[], int n){
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]>arr[0]){
                start = mid+1;
            } else {
                end = mid;
            }
            mid = start + (end - start)/2;
        }
        return start;
      
    }

    int searchBinary(int arr[], int s, int e, int key){
        int start = s;
        int end = e;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return mid;
            }

            if(key>arr[mid]){
                start = mid +1;
            } else if(key<arr[mid]){
                end = mid-1;
            } 
            mid = start + (end-start)/2;
        }
     return -1;
    }

    int rotatedArraySearch(int arr[], int n, int k){
        int pivot = pivotElement(arr, n);
        if(arr[pivot]<=k && k<=arr[n-1]){
            return searchBinary(arr, pivot, n-1, k);

        } else {
            return searchBinary(arr, 0, pivot-1, k);
        }
    }

   public static void main(String[] args){
        int arr[] = {7, 9, 1, 2, 3};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        Rotated obj = new Rotated();
        int ans = obj.rotatedArraySearch(arr, n, key);

        if(ans != -1){
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}