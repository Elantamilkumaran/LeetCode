// Last updated: 9/10/2026, 9:46:13 AM
class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        int lsum=0;
        int rsum=0;
        for(int i=0;i<n;i++){
            lsum+=nums[i];
            rsum+=nums[n-i-1];
            ls[i]=lsum;
            rs[n-i-1]=rsum;
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            if((ls[i]-rs[i+1])%2==0){
                ans++;
            }
        }
        return ans;
    }
}