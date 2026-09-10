// Last updated: 9/10/2026, 9:54:45 AM
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            int[] curr = points[i];
            int[] next=points[i+1];
            while(!(curr[0]==next[0] && curr[1]==next[1])){
                if(curr[0]<next[0]){
                    curr[0]++;
                }
                else if(curr[0]>next[0]){
                    curr[0]--;
                }
                if(curr[1]<next[1]){
                    curr[1]++;
                }
                else if(curr[1]>next[1]){
                    curr[1]--;
                }
                count++;
            }
        }
        return count;
    }
}