// Last updated: 1/8/2026, 3:34:17 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        int pre=1;
        int post=1;
        for(int i=0;i<n;i++){
            ans[i]*=pre;
            pre*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]*=post;
            post*=nums[i];
        }
        return ans;
    }
}