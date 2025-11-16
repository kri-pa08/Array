//Pivot Element
class BinarySearch4{
    int getPivot(int arr[], int n){
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]>=arr[0]){
                start = mid+1;
            } else {
                end = mid;
            }
            mid = start + (end - start)/2;

        }

        return start;


    }
    public static void main(String[] args){
    int arr[] = {7, 9, 1, 2, 3};

    BinarySearch4 obj = new BinarySearch4();
    int pivotIndex = obj.getPivot(arr,5);
    System.out.print("  Pivot Element is: " + arr[pivotIndex]);
 }

}
