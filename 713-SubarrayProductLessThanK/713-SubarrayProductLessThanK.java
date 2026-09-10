// Last updated: 9/10/2026, 9:57:13 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums.length==1) return 0;
        int ans=0;
        int l=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
            while(p>=k){
                p/=nums[l];
                l++;
            }
            ans+=(i-l+1);
        }
        return ans;
    }
}