// Last updated: 1/8/2026, 3:32:52 PM
class Solution {
public:
    int xorOperation(int n, int start) {
        int n1=n;
        int num[n1];
        for(int i=0;i<n;i++){
            num[i]=start+2*i;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum^=num[i];
        }
        return sum;
    }
};