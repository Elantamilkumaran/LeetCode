// Last updated: 1/8/2026, 3:35:02 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        String ans="";
        for(char ch:strs[0].toCharArray()){
            int count=0;
            s+=ch;
            for(String t:strs){
                if(t.startsWith(s)) count++;
            }
            if(strs.length==count){
                ans=s;
            }
        }
        return ans;
    }
}