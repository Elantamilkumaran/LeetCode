// Last updated: 9/10/2026, 9:55:53 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=(nums[i]*nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}