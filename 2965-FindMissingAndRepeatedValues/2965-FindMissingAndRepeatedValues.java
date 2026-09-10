// Last updated: 9/10/2026, 9:47:28 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m.put(grid[i][j],m.getOrDefault(grid[i][j],0)+1);
            }
        }
        int e=n*n;
        int nsum=(e*(e+1))/2;
        int ksum=0;
        int rep=0;
        for(int key:m.keySet()){
            if(m.get(key)>1) rep=key;
            ksum+=key;
        }
        int ans[]=new int[2];
        ans[0]=rep;
        ans[1]=nsum-ksum;
        return ans;
    }
}