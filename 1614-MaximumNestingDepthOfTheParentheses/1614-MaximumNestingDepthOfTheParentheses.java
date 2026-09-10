// Last updated: 9/10/2026, 9:53:13 AM
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
                count++;
                ans=Math.max(count,ans);
            }
            else if(s.charAt(i)==')'){
                st.pop();
                count--;
            }
        }
        return ans;
    }
}