// Last updated: 9/10/2026, 9:47:10 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int num:nums){
            if(num<k){
                ans++;
            }
        }
        return ans;
    }
}