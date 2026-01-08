// Last updated: 1/8/2026, 3:33:41 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int vertical_distance=0;
        int horizontal_distance=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                vertical_distance++;
            }
            else if(ch=='D'){
                vertical_distance--;
            }
            else if(ch=='R'){
                horizontal_distance++;
            }
            else if(ch=='L'){
                horizontal_distance--;
            }
        }
        return (horizontal_distance==0 && vertical_distance==0);
    }
}