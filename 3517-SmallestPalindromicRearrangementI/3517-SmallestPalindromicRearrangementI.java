// Last updated: 9/10/2026, 9:45:50 AM
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        String ch="";
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                ch+=(char)('a'+i);
            }
            for(int j=0;j<freq[i]/2;j++){
                sb.append((char)('a'+i));
            }
        }
        String org=sb.toString();
        if(!ch.equals("")){
            org+=ch;
        }
        org+=sb.reverse().toString();
        return org;
    }
}