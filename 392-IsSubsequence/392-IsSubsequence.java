// Last updated: 1/8/2026, 3:33:59 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int si=0;
        int ti=0;
        if(s.length()==0) return true;
        while(ti!=t.length()){
            if(s.charAt(si)==t.charAt(ti)){
                si++;
                ti++;
                if(s.length()==si){
                    return true;
                }
            }
            else{
                ti++;
            }
        }
        return false;
    }
}