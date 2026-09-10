// Last updated: 9/10/2026, 9:45:05 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int count_a=0;
        int count_b=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') count_a++;
            else count_b++;
        }
        if(count_a==count_b) return 0;
        else if(count_a==0 || count_b==0) return s.length();
        else return Math.abs(count_a-count_b);
    }
}