// Last updated: 9/10/2026, 9:45:22 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        long ans;
        long min=nums[0];
        long max=nums[0];
        for(int i=1;i<n;i++){
            if(min>nums[i]) min=nums[i];
            if(max<nums[i]) max=nums[i];
        }
        ans=(max-min)*k;
        return ans;
    }
}