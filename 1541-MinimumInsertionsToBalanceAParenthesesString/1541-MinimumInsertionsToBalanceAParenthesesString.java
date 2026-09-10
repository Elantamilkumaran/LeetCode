// Last updated: 9/10/2026, 9:53:22 AM
class Solution {
    public int minInsertions(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(st.isEmpty()){
                    st.push('(');
                }
                else{
                    if(st.peek()!='('){
                        count++;
                        st.pop();
                        st.pop();
                    }
                    st.push(ch);
                }
            }
            else{
                if(st.isEmpty()){
                    count++;
                    st.push('(');
                    st.push(ch);
                }
                else{
                    if(st.peek()=='('){
                        st.push(ch);
                    }
                    else{
                        st.pop();
                        st.pop();
                    }
                }
            }
        }
        if(st.isEmpty()) return count;
        else{
            while(!st.isEmpty()){
                char c=st.pop();
                if(c=='('){
                    count+=2;
                }
                else{
                    count++;
                    st.pop();
                }
            }
        }
        return count;
    }
}