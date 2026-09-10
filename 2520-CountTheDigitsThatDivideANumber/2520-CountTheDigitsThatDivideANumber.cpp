// Last updated: 9/10/2026, 9:49:18 AM
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