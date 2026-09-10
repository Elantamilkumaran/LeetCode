// Last updated: 9/10/2026, 9:49:26 AM
class Solution {
    public int numberOfCuts(int n) {
         if(n==1){
            return 0;
        }
        else if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
    }
}