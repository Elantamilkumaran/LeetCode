// Last updated: 1/8/2026, 3:33:19 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int n:arr){
            if(n%2!=0){
                c++;
                if(c==3){
                    return true;
                }
                continue;
            }
            c=0;
        }
        return false; 
    }
}