// Last updated: 9/10/2026, 9:49:44 AM
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0) return true;
        for(int i=0;i<num;i++){
            int rev=reverse(i);
            if(i+rev==num) return true;
        }
        return false;
    }
    public int reverse(int n){
        int d,rev=0;
        while(n!=0){
            d=n%10;
            rev=(rev*10)+d;
            n/=10;
        }
        return rev;
    }
}