// Last updated: 1/8/2026, 3:34:26 PM
class Solution {
public:
    int countPrimes(int n) {
        vector<int> a(n,1);
        for(long i=2;i<n;i++){
            if(a[i]==1){
                for(long j=i*i;j<n;j+=i){
                    if(a[j]==1) a[j]=0;
                }
            }
            else{continue;}
        }
        int c=0;
        for(int i=2;i<n;i++){
                if(a[i]==1){
                    c++;
                }
            }
        return c;    
    }
};