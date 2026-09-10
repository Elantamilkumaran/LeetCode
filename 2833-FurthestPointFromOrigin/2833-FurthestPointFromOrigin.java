// Last updated: 9/10/2026, 9:48:02 AM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int dl=0;
        int dr=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                dl--;
                dr--;
            }
            else if(moves.charAt(i)=='R'){
                dl++;
                dr++;
            }
            else{
                dl--;
                dr++;
            }
        }
        return Math.max(Math.abs(dl),Math.abs(dr));
    }
}