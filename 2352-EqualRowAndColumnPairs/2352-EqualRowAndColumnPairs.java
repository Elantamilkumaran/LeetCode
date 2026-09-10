// Last updated: 9/10/2026, 9:50:13 AM
class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int[][] col=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                col[j][i]=grid[i][j];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Arrays.equals(grid[i],col[j])){
                count++;
                }
            }
        }
        return count;
    }
}