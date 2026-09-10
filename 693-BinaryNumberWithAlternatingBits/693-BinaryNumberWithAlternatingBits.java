// Last updated: 9/10/2026, 9:57:16 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String s="";
        while(n!=0){
            s=(n%2)+s;
            n/=2;
        }
        char on='1';
        char off='0';
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==on && s.charAt(i+1)!=off) return false;
            else if(s.charAt(i)==off && s.charAt(i+1)!=on) return false;
        }
        return true;
    }
}