// Last updated: 9/10/2026, 9:52:05 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int cost:costs){
            max=Math.max(max,cost);
        }
        int[] freq=new int[max+1];
        for(int cost:costs){
            freq[cost]++;
        }
        int ans=0;
        for(int p=1;p<=max;p++){
            int buy=Math.min(freq[p],coins/p);
            ans+=buy;
            coins-=buy*p;
            if(p>coins) break;
        }
        return ans;
    }
}