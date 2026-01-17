// Last updated: 1/17/2026, 10:37:38 AM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=k-1;i>=0;i--) sb.append(s.charAt(i));
        if(sb.length()==s.length()) return sb.toString();
        for(int i=k;i<s.length();i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}