// Last updated: 9/10/2026, 9:44:19 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                count+=matrix[j][i];
            }
            ans[i]=count;
        }
        return ans;
    }
}