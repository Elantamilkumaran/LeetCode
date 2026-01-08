// Last updated: 1/8/2026, 3:33:17 PM
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                continue;
            }
            else if(ch == ')'){
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '('){
                    str.append(stack.pop());
                }
                stack.pop();
                for(char i : str.toString().toCharArray()){
                    stack.push(i);
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}