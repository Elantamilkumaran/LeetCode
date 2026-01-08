// Last updated: 1/8/2026, 3:35:05 PM
class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        String p1;
        String p2;
        for(int i=0;i<s.length();i++){
            p1=expand(s,i,i);
            p2=expand(s,i,i+1);
            if(p1.length()>longest.length()){
                longest=p1;
            }
            if(p2.length()>longest.length()){
                longest=p2;
            }
        }
        return longest;
    }
    public String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}