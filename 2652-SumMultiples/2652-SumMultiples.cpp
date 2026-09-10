// Last updated: 9/10/2026, 9:48:50 AM
class Solution {
public:
    int sumOfMultiples(int n) {
        int s=0;
        for(int i=0;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                s+=i;
            }
        }
        return s;
        
    }
};