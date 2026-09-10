// Last updated: 9/10/2026, 9:48:08 AM
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        boolean eve=(s1.charAt(0)==s2.charAt(0))&&(s1.charAt(2)==s2.charAt(2))||(s1.charAt(0)==s2.charAt(2))&&(s1.charAt(2)==s2.charAt(0));
        boolean odd=(s1.charAt(1)==s2.charAt(1))&&(s1.charAt(3)==s2.charAt(3))||(s1.charAt(1)==s2.charAt(3))&&(s1.charAt(3)==s2.charAt(1));
        return eve && odd;
    }
}