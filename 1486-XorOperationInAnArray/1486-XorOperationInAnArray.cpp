// Last updated: 9/10/2026, 9:53:32 AM
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