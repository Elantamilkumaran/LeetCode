// Last updated: 9/10/2026, 9:52:03 AM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<=n/2;i++){
            if(nums[i]==target){
                ans=Math.min(ans,Math.abs(i-start));
            }
            if(nums[n-i-1]==target){
                ans=Math.min(ans,Math.abs((n-i-1)-start));
            }
        }
        return ans;
    }
}