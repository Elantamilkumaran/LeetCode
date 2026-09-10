// Last updated: 9/10/2026, 9:43:54 AM
class Solution {
    public int maxDistance(String moves) {
        int lc=0;
        int rc=0;
        int uc=0;
        int dc=0;
        int k=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') lc++;
            else if(moves.charAt(i)=='R') rc++;
            else if(moves.charAt(i)=='U') uc++;
            else if(moves.charAt(i)=='D') dc++;
            else k++;
        }
        return Math.abs(rc-lc)+Math.abs(uc-dc)+k;
    }
}