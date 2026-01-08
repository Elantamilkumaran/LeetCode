// Last updated: 1/8/2026, 3:34:19 PM
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n<1) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
};