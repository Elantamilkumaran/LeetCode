// Last updated: 9/10/2026, 9:50:40 AM
class Solution {
    public int countPairs(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && i*j % k==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}