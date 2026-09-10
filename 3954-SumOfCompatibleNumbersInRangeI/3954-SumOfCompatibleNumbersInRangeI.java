// Last updated: 9/10/2026, 9:43:51 AM
class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int s=(n-k<1)?1:n-k;
        for(int i=s;i<=n+k;i++){
            if((n&i)==0) sum+=i;
        }
        return sum;
    }
}