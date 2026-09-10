// Last updated: 9/10/2026, 9:59:35 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (int)Math.pow(2,(int)(Math.log(n)/Math.log(2)))==n;
    }
}