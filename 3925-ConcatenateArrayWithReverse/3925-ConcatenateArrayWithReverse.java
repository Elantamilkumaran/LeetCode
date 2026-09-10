// Last updated: 9/10/2026, 9:44:05 AM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[n+i]=nums[n-i-1];
        }
        return ans;
    }
}