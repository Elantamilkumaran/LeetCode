// Last updated: 1/8/2026, 3:33:58 PM
class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==']'){
                char c=' ';
                String temp="";
                String k="";
                while(!st.isEmpty() && ((c=st.pop())!='[')){
                    temp=c+temp;
                }
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k=st.pop()+k;
                }
                temp=temp.repeat(Integer.parseInt(k));
                for(int j=0;j<temp.length();j++){
                    st.push(temp.charAt(j));
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
