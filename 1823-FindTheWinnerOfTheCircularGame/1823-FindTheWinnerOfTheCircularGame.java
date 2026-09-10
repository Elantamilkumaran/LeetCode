// Last updated: 9/10/2026, 9:52:16 AM
class Solution {
    public int findTheWinner(int n, int k) {
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=(ans+k)%i;
        }
        return ans+1;
    }
}