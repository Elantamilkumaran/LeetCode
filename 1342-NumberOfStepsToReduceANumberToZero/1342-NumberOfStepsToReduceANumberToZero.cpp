// Last updated: 9/10/2026, 9:54:31 AM
class Solution {
public:
    int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                c++;
            }
            else{
                num-=1;
                c++;
            }
        }
        return c;
    }
};