// Last updated: 9/10/2026, 9:43:57 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}