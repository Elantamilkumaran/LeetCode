// Last updated: 9/10/2026, 9:51:54 AM
class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int sum;
        for(int i=0;i<n/2;i++){
            sum=nums[i]+nums[n-i-1];
            if(max<sum) max=sum;
        }
        return max;
    }
}