// Last updated: 1/8/2026, 3:34:09 PM
class Solution {
public:
    bool isPowerOfThree(int n) {
        if(n<1) return false;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
};