// Last updated: 1/8/2026, 3:32:26 PM
class Solution {
public:
    bool isThree(int n) {
        int c=2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==3){
            return true;
        }
        else{
            return false;
        }
    }
};