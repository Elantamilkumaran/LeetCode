// Last updated: 9/10/2026, 9:48:36 AM
class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans+=(nums[i-1]*nums[i-1]);
            }
        }
        return ans;
    }
}