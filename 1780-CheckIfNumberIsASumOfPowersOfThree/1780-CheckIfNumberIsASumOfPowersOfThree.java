// Last updated: 9/10/2026, 9:52:31 AM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n!=0){
            if(n%3!=0 && n%3!=1){
                return false;
            }
            n/=3;
        }
        return true;
    }
}