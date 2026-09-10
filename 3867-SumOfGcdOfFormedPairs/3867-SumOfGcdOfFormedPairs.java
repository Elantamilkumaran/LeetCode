// Last updated: 9/10/2026, 9:44:26 AM
class Solution {
    public long gcdSum(int[] nums) {
        long max=Integer.MIN_VALUE;
        long[] ans=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            long g=gcd(nums[i],max);
            ans[i]=g;
        }
        Arrays.sort(ans);
        int l=0;
        int r=ans.length-1;
        long sum=0;
        while(l<r){
            sum+=(gcd(ans[l],ans[r]));
            l++;
            r--;
        }
        return sum;
    }
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
        
    }
}