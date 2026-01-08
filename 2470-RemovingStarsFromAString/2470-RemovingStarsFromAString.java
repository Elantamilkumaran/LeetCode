// Last updated: 1/8/2026, 3:32:05 PM
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*') stack.pop();
            else stack.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }   
}