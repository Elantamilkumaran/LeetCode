// Last updated: 9/10/2026, 9:58:24 AM
class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()) return 0;
        String[] a=s.trim().split("\s+");
        return a.length;
    }
}