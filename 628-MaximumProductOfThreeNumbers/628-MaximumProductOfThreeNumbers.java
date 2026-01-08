// Last updated: 1/8/2026, 3:33:45 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int s=nums.length;
        int m=Math.max(nums[0]*nums[1]*nums[s-1],nums[s-1]*nums[s-2]*nums[s-3]);
        return m;
    }
}