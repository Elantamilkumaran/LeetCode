// Last updated: 9/10/2026, 9:50:14 AM
class Solution {
    public String decodeMessage(String key, String message) {
        char[] ch=new char[26];
        StringBuilder sb=new StringBuilder();
        int idx=0;
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' ' && sb.indexOf(c+"")==-1){
                ch[c-'a']=(char)('a'+idx);
                sb.append(c);
                idx++;
                if(idx==26) break;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int j=0;j<message.length();j++){
            if(message.charAt(j)==' ') ans.append(' ');
            else ans.append(ch[message.charAt(j)-'a']);
        }
        return ans.toString();
    }
}