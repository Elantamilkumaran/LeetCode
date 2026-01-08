// Last updated: 1/8/2026, 3:31:54 PM
class Solution {
public:
    int countDigits(int num) {
        int t=num;
        int c=0;
        while(num){
            if(t%(num%10)==0){
                c+=1;
            }
            num/=10;
        }
        return c;
    }
};