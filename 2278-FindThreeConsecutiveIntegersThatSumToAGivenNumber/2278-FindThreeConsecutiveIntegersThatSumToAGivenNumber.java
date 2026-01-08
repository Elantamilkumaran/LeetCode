// Last updated: 1/8/2026, 3:32:12 PM
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