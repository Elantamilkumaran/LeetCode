// Last updated: 1/15/2026, 10:47:52 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==0){
                sum=nums[0];
                leftSum[0]=0;
                continue;
            }
            leftSum[i]=sum;
            sum+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                sum=nums[n-1];
                rightSum[n-1]=0;
                continue;
            }
            rightSum[i]=sum;
            sum+=nums[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}