// Last updated: 1/8/2026, 3:35:04 PM
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long temp=x;
        long long r=0;
        long long d;
        while(x){
            d=x%10;
            r=(r*10)+d;
            x/=10;
        }
        return r==temp;
        }
};