// Last updated: 9/10/2026, 9:49:08 AM
class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        while(n!=0){
            a.add(n%10);
            n/=10;
        }
        int ans=0;
        int sign;
        if(a.size()%2==0) sign=-1;
        else sign=1;
        for(int i=a.size()-1;i>=0;i--){
            if(i%2==0){
                ans+=(a.get(i)*sign);
            }
            else{
                ans+=(a.get(i)*sign*-1);
            } 
        }
        return ans;
    }
}