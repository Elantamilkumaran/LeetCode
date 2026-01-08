// Last updated: 1/8/2026, 3:33:32 PM
class Solution {
public:
    int fib(int n) {
        int a=0,b=1,t,res;
        for(int i=0;i<=n;i++){
            res=a;
            t=a+b;
            a=b;
            b=t;
        }
        return res;
    }
};