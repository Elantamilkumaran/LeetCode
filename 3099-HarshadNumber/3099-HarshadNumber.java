// Last updated: 9/10/2026, 9:46:59 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t=x;
        int sum=0;
        while(t!=0){
            sum+=t%10;
            t/=10;
        }
        if(x%sum==0) return sum;
        else return -1;
    }
}