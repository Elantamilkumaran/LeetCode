// Last updated: 9/10/2026, 9:55:36 AM
class Solution {
    public int heightChecker(int[] heights) {
        int[] t=heights.clone();
        Arrays.sort(t);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(t[i]!=heights[i]) ans++;
        }
        return ans;
    }
}