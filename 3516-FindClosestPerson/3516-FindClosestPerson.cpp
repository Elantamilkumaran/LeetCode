// Last updated: 9/10/2026, 9:45:46 AM
class Solution {
public:
    int findClosest(int x, int y, int z) {
       int a1=abs(z-x);
       int a2=abs(z-y);
       if(a1<a2){
        return 1;
       } 
       else if(a1>a2){
        return 2;
       }
       else{
        return 0;
       }
    }
};