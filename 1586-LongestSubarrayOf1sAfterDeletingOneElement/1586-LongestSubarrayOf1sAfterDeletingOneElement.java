// Last updated: 1/8/2026, 3:32:54 PM
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