// Last updated: 9/10/2026, 9:56:20 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(max<piles[i]) max=piles[i];
        }
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            long hrs=totalHrs(piles,mid);
            if(hrs<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public long totalHrs(int[] piles, int hrs){
        long ans=0;
        for(int i=0;i<piles.length;i++){
            ans+=(long)Math.ceil((double)piles[i]/hrs);
        }
        return ans;
    }
}