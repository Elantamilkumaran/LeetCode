// Last updated: 9/10/2026, 9:56:02 AM
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