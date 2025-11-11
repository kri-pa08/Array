import java.util.ArrayList;
import java.util.Scanner;

class TwoSum {

    public int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // return empty array if no pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();

        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            arrList.add(num);
        }

        // Convert ArrayList to int[]
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(arr, target);

        if (result.length == 0) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        }

        sc.close();
    }
}

    

