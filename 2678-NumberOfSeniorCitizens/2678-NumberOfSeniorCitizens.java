// Last updated: 9/10/2026, 9:48:52 AM
class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String d:details){
            if(d.charAt(11)>='6' && d.charAt(12)>'0') ans++;
            else if(d.charAt(11)>'6' && d.charAt(12)>='0') ans++;
        }
        return ans;
    }
}