// Last updated: 9/10/2026, 9:58:20 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        List<Integer> a=new ArrayList<>();
        int k=p.length();
        for(char ch:p.toCharArray()){
            freq1[ch-'a']++;
        }
        int l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq2[ch-'a']++;
            if(i-l+1==k){
                if(Arrays.equals(freq1,freq2)){
                    a.add(l);
                }
                freq2[s.charAt(l)-'a']--;
                l++;
            }
        }
        return a;
    }
}