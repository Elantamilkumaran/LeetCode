// Last updated: 9/10/2026, 9:44:40 AM
class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=k-1;i>=0;i--) sb.append(s.charAt(i));
        if(sb.length()==s.length()) return sb.toString();
        for(int i=k;i<s.length();i++) sb.append(s.charAt(i));
        return sb.toString();
    }
}