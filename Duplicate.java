import java.util.ArrayList;
import java.util.Scanner;

class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
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

        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }

        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.containsDuplicate(arr);

        if (result) {
            System.out.println(" The array contains duplicates.");
        } else {
            System.out.println(" No duplicates found.");
        }

        sc.close();
    }
}
