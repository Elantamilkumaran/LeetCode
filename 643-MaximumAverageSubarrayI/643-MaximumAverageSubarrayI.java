// Last updated: 1/8/2026, 3:33:44 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1==k){
                max=Math.max(sum,max);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return (double)max/k;
    }
}