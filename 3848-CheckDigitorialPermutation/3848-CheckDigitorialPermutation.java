// Last updated: 9/10/2026, 9:44:35 AM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        if(n<=0) return false;
        int t=n;
        int c=-1;
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        while(n!=0){
            int d=n%10;
            c=d;
            hs.add(d);
            sum+=fact(d);
            n/=10;
        }
        if(c==0) return false;
        int[] freq=new int[10];
        while(t!=0){
            freq[t%10]++;
            t/=10;
        }
        while(sum!=0){
            freq[sum%10]--;
            sum/=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}