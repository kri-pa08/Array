//Version 1: Fixed-Size Array Input

import java.util.Scanner;

class UniqueElement{
    int findUnique(int arr[], int size){
        int ans = 0;
        for(int i =0; i<size; i++){
            ans = ans^arr[i];

        }
        return ans;

    }

    void printArray(int arr[], int n){
              for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        UniqueElement obj = new UniqueElement();

            
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.print("Array elements: ");
            obj.printArray(arr, n);
           int unique = obj.findUnique(arr, n);
             System.out.println("Unique element is: " + unique);







    }

    
    

}
