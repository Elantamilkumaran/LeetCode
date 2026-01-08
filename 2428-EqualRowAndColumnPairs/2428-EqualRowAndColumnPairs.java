// Last updated: 1/8/2026, 3:32:08 PM
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