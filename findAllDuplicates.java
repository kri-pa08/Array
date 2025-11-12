import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && !arrList.contains(nums[i])) {
                    arrList.add(nums[i]);
                }
            }
        }
        
        return arrList;
    }
}
