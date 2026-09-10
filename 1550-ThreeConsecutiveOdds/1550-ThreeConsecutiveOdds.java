// Last updated: 9/10/2026, 9:55:09 AM
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