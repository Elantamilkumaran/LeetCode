// Last updated: 1/8/2026, 3:33:51 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String s2=s+s;
        String trim_str=s2.substring(1,s2.length()-1);
        return trim_str.contains(s);
    }
}