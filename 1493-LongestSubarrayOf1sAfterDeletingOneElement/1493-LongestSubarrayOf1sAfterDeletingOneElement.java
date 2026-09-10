// Last updated: 9/10/2026, 9:53:36 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int current=0;
        int prev=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) current++;
            else{
                ans=Math.max(ans,current+prev);
                prev=current;
                current=0;
            }
        }
        ans=Math.max(ans,current+prev);
        ans=(ans==nums.length)?ans-1:ans;
        return ans;
    }
}