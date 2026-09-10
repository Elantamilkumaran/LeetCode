// Last updated: 9/10/2026, 9:50:03 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int[] freq=new int[26];
        int min=Integer.MAX_VALUE;
        int l=0;
        for(int i=0;i<blocks.length();i++){
            char ch=blocks.charAt(i);
            freq[ch-'A']++;
            if(i-l+1==k){
                min=Math.min(min,freq['W'-'A']);
                freq[blocks.charAt(l)-'A']--;
                l++;
            }
        }
        return min;
    }
}