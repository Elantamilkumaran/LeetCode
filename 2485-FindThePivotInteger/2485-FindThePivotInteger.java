// Last updated: 9/10/2026, 9:49:30 AM
class Solution {
    public int pivotInteger(int n) {
        if(n<2) return n;
        int t=0;
        int sum=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            sum=sum-i;
            if(sum==t){
                return i;
            }
            t+=i;
        }
        return -1;
    }
}