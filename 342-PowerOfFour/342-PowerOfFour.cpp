// Last updated: 1/8/2026, 3:34:04 PM
class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n<1) return false;
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
};