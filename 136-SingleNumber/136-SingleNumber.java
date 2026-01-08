// Last updated: 1/8/2026, 3:34:37 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}