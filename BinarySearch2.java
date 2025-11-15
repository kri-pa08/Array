class Search {

    public int firstOccurence(int[] nums, int target) {
        int first = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;     // go left
            } else if (nums[mid] < target) {
                start = mid + 1;   // go right
            } else {
                end = mid - 1;     // go left
            }
        }
        return first;
    }

    public int lastOccurence(int[] nums, int target) {
        int last = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;   // go right
            } else if (nums[mid] < target) {
                start = mid + 1;   // right
            } else {
                end = mid - 1;     // left
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5};

        Search obj = new Search();

        int first = obj.firstOccurence(nums, 3);
        int last = obj.lastOccurence(nums, 3);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
