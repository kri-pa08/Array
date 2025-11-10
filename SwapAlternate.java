
class SwapAlternate{
    void printArray(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void swapAlternate(int arr[], int size){
        for(int i=0; i<size-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
      public static void main(String[] args) {
        SwapAlternate obj = new SwapAlternate();

        int even[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int odd[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before Swapping even");
        obj.printArray(even, even.length);
        obj. swapAlternate(even, even.length);
        System.out.println("After Swapping even");
        obj.printArray(even, even.length);

        System.out.println("\nBefore Swapping odd");
        obj.printArray(odd, odd.length);
        obj. swapAlternate(odd, odd.length);
        System.out.println("After Swapping odd");
        obj.printArray(odd, odd.length);
      }
}