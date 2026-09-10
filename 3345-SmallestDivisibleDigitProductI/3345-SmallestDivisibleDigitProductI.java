// Last updated: 9/10/2026, 9:46:15 AM
class Solution {
    public int smallestNumber(int n, int t) {
        int count=1;
        while(count!=0){
            int te=n;
            int m=1;
            while(te!=0){
                m=m*(te%10);
                te/=10;
            }
            if(m%t==0){
                count=0;
            }
            n++;
        }
        return n-1;
    }
}