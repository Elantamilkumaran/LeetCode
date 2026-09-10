// Last updated: 9/10/2026, 9:59:05 AM
class Solution {
    public boolean canWinNim(int n) {
        if(n<=2) return true;
        else if(n%4==0){
            return false;
        }
        return true;
    }
}