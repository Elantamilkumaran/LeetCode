// Last updated: 9/10/2026, 9:59:49 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}