// Last updated: 9/10/2026, 9:52:19 AM
class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        if(edges[1][0]==a || edges[1][1]==a)return a;
        else return b;
    }
}