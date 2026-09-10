// Last updated: 9/10/2026, 9:59:58 AM
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        if(n==1 && n==7){
            return true;
        }
        int sum=0;
        while(n!=1){
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
            sum=0;
            if(a.contains(n)){
                return false;
            }
            a.add(n);
        }
        return true;
    }
}