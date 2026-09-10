// Last updated: 9/10/2026, 10:00:17 AM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int max=Integer.MIN_VALUE;
        int prefix=1,suffix=1;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    }
}