// Last updated: 9/10/2026, 9:46:54 AM
class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] as=s.toCharArray();
        int ans=0;
        for(char ch:as){
            ans+=Math.abs(s.indexOf(ch)-t.indexOf(ch));
        }
        return ans;
    }
}