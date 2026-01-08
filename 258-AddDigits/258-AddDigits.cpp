// Last updated: 1/8/2026, 3:34:15 PM
class Solution {
public:
    int addDigits(int num) {
        while(num>=10){
            int s=0;
            while(num>0){
                s+=num%10;
                num/=10;
            }
            num=s;
        }
        return num;
    }
};