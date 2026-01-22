// Last updated: 1/22/2026, 12:24:45 PM
class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    public int reverse(int n){
        int rev=0,d;
        while(n!=0){
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        return rev;
    }
}