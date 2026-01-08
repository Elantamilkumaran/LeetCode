// Last updated: 1/8/2026, 3:33:25 PM
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