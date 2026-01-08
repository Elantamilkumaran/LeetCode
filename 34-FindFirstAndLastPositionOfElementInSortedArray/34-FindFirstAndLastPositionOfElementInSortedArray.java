// Last updated: 1/8/2026, 3:34:55 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
         if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;  
                }
                last = i;      
            }
        }

        return new int[]{first, last};
    }
}