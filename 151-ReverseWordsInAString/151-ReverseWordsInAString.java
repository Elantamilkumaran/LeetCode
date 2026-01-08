// Last updated: 1/8/2026, 3:34:32 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
}