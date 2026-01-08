// Last updated: 1/8/2026, 3:33:20 PM
class Solution {
    public int tribonacci(int n) {
       int a=0;
       int b=1;
       int c=1;
       int t;
       for(int i=0;i<n;i++){
            t=a+b+c;
            a=b;
            b=c;
            c=t;
        }
        return a;
    }
}