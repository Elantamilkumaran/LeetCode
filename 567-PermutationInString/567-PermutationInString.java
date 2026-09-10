// Last updated: 9/10/2026, 9:57:37 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int k=s1.length();
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        int l=0;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
            if(i-l+1==k){
                if(Arrays.equals(freq1,freq2)){
                    return true;
                }
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
    }
}