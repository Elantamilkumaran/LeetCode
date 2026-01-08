// Last updated: 1/8/2026, 3:31:57 PM
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