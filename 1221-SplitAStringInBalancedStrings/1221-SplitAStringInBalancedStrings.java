// Last updated: 9/10/2026, 9:54:55 AM
class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') t++;
            else t--;
            if(t==0) ans++;
        }
        return ans;
    }
}