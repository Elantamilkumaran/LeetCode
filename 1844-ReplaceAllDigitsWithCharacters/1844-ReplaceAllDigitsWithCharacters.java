// Last updated: 9/10/2026, 9:52:15 AM
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(s.charAt(i));
            }
            else{
                sb.append((char)(s.charAt(i-1)+(s.charAt(i)-'0')));
            }
        }
        return sb.toString();
    }
}