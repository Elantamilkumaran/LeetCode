// Last updated: 9/10/2026, 9:50:39 AM
class Solution {
    public long[] sumOfThree(long num) {
        long[] ans=new long[3];
        if(num%3==0){
            long x=num/3;
            ans[0]=x-1;
            ans[1]=x;
            ans[2]=x+1;
            return ans;
        }
        return new long[0];
    }
}