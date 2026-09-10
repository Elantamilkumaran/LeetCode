// Last updated: 9/10/2026, 9:55:52 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int zeros=0;
        int maxlen=0;
        int len;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            if(zeros<=k){
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        return maxlen;
    }
}