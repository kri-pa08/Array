class SelectionSort{
    void sort(int num[], int n) {
for (int i=0; i<n; i++){
    int minIndex = i;
    for (int j=i+1; j<=n; j++){
        if (num[j] > num[minIndex]){
            minIndex = j; 
        }
    }
            int temp = num[i];
        num[i] = num[minIndex];
        num[minIndex] = temp;
        }
    
}
public static void main(String[] args){
    int[] arr = {65, 25, 12, 22, 11};
    SelectionSort obj = new SelectionSort();
    obj.sort(arr, arr.length);
    System.out.println("Sorted Array");
    for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}