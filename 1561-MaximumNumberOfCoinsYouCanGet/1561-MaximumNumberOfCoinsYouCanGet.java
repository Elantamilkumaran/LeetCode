// Last updated: 9/10/2026, 9:53:16 AM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int ind=n-2;
        int sum=0;
        for(int i=0;i<n/3;i++){
            sum+=piles[ind];
            ind-=2;
        }
        return sum;
    }
}