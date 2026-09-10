// Last updated: 9/10/2026, 9:44:52 AM
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long temp=0;
        while(n>0){
            long d=n%10;
            if(d!=0){
                sum+=d;
                temp=(temp*10)+d;
            }
            n/=10;
        }
        long rev=0;
        while(temp>0){
            long d=temp%10;
            rev=(rev*10)+d;
            temp/=10;
        }
        return sum*rev;
    }
}