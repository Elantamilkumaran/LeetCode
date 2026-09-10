// Last updated: 9/10/2026, 9:44:08 AM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n!=0){
                int d=n%10;
                if(d==digit) ans++;
                n/=10;
            }
        }
        return ans;
    }
}