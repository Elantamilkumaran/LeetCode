// Last updated: 9/10/2026, 9:53:50 AM
class Solution {
    public int[] finalPrices(int[] prices) {
        int dis;
        int n=prices.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            dis=0;
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    dis=prices[j];
                    break;
                }
            }
            ans[i]=prices[i]-dis;
        }
        ans[n-1]=prices[n-1];
        return ans;
    }
}