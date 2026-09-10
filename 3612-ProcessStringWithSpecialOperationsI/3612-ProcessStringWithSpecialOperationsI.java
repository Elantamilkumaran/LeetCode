// Last updated: 9/10/2026, 9:45:33 AM
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(sb.length()==0){}
                else{
                    sb.setLength(sb.length()-1);
                }
            }
            else if(ch=='#'){
                sb.append(sb);
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}