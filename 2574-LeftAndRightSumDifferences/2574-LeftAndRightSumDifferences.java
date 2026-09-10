// Last updated: 9/10/2026, 9:49:01 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        int[] ans=new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
            sum2+=nums[n-i-1];
            ls[i]=sum1;
            rs[n-i-1]=sum2;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(ls[i]-rs[i]);
        }
        return ans;
    }
}