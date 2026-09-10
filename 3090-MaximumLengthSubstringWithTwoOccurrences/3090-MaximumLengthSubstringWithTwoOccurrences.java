// Last updated: 9/10/2026, 9:47:06 AM
class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int max=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
                freq[sb.charAt(0)-'a']--;
                sb.deleteCharAt(0);
            }
            max=Math.max(sb.length(),max);
        }
        return max;
    }
}