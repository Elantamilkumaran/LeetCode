// Last updated: 9/10/2026, 9:46:29 AM
class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int l=0;
        int a=0;
        int b=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            int n=Integer.valueOf(s.charAt(i)+"");
            if(n%2==0) a++;
            else b++;
            while(a>k && b>k){
                int t=Integer.valueOf(s.charAt(l)+"");
                if(t%2==0) a--;
                else b--;
                l++;
            }
            ans+=(i-l+1);
        }
        return ans;
    }
}