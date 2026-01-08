// Last updated: 1/8/2026, 3:33:34 PM
class Solution {
    public static int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int count=Integer.bitCount(i);
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}