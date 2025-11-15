//Mountain Peak Problem Leetcode

class BinarySearch{
 public int peakPoint(int arr[]){
    int start = 0;
    int end = arr.length-1;

  

    while(start<end){
          int mid = start + (end - start )/2;

          if(arr[mid]<arr[mid+1]){
            start = mid+1;

          } 
          else {
            end = mid;
          }

    }
    return start;
 }

 public static void main(String[] args){
    int arr[] = {3, 4, 5, 1};

    BinarySearch obj = new BinarySearch();
    int start = obj.peakPoint(arr);
    System.out.print("Peak Element is: " + start);
 }
}