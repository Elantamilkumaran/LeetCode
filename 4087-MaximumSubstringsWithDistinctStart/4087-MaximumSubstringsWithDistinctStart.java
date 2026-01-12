// Last updated: 1/12/2026, 12:28:12 PM
class Solution {
    public int maxDistinct(String s) {
        //HashMap<Character,Integer> m=new HashMap<>();
        //for(char ch:s.toCharArray()){
        //    m.put(ch,m.getOrDefault(ch,0)+1);
        //}
        //return m.size();
        int[] a=new int[26];
        int ans=0;
        for(char ch:s.toCharArray()){
            if(a[ch-'a']==0){
                a[ch-'a']++;
                ans++;
            }
        }
        return ans;
    }
}