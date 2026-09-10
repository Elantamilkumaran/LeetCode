// Last updated: 9/10/2026, 9:55:49 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=weights[0];
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(max<weights[i]) max=weights[i];
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int Tdays=noOfDays(weights,mid);
            if(Tdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int noOfDays(int[] weights, int cap){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load >cap){
                day++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
}