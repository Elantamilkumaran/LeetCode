// Last updated: 9/10/2026, 9:45:18 AM
class Solution {
    public int earliestTime(int[][] tasks) {
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            sum=Math.min(sum,tasks[i][0]+tasks[i][1]);
        }
        return sum;
    }
}