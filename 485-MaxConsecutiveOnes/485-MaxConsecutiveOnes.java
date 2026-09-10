// Last updated: 9/10/2026, 9:58:04 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
        ans=Math.max(ans,count);
        return ans;
    }
}