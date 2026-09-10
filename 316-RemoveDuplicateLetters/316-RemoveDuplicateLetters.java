// Last updated: 9/10/2026, 9:59:01 AM
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        Stack<Character> st=new Stack<>();
        int[] lastSeen=new int[26];
        for(int i=0;i<s.length();i++){
            if(lastSeen[s.charAt(i)-'a']==1){
                continue;
            }
            while(!st.isEmpty() && i<lastIndex[st.peek()-'a'] && st.peek()>s.charAt(i)){
                char c = st.pop();
                lastSeen[c-'a']=0;
            }
            st.push(s.charAt(i));
            lastSeen[s.charAt(i)-'a']=1;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}