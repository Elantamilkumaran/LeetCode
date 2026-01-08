// Last updated: 1/8/2026, 3:31:11 PM
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