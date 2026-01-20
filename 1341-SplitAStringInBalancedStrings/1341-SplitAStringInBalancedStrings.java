// Last updated: 1/20/2026, 4:04:22 PM
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