// Last updated: 9/10/2026, 9:45:11 AM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target) cnt++;
                if(2*cnt>j-i+1){
                    ans++;
                }
            }
        }
        return ans;
    }
}