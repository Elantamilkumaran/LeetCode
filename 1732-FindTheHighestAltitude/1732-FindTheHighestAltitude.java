// Last updated: 9/10/2026, 9:52:41 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        int sum=0;
        ans[0]=sum;
        for(int i=1;i<gain.length+1;i++){
            sum+=gain[i-1];
            ans[i]=sum;
        }
        int max=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max) max=ans[i];
        }
        return max;
    }
}