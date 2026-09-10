// Last updated: 9/10/2026, 9:52:54 AM
class Solution {
    public String interpret(String command) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                ans.append('G');
            }
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    ans.append('o');
                    i++;
                }
            }
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)=='a'){
                    if(command.charAt(i+2)=='l'){
                        if(command.charAt(i+3)==')'){
                            ans.append("al");
                            i+=3;
                        }
                    }
                }
            }
        }
        return ans.toString();
    }
}