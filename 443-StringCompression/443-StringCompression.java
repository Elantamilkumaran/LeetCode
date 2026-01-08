// Last updated: 1/8/2026, 3:33:53 PM
class Solution {
    public int compress(char[] chars) {
        int n=0;
        String code="";
        char p=chars[0];
        for(int i=0;i<chars.length;i++){
            if(chars[i]==p){
                n++;
            }
            else{
                code+=p;
                if(n>1){
                    code+=n;
                }
                p=chars[i];
                n=1;
            }
        }
        code+=p;
        if(n>1){
            code+=n;
        }
        for(int i=0;i<code.length();i++){
            chars[i]=code.charAt(i);
        }
        return code.length();
    }
}