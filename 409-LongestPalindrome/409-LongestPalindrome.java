// Last updated: 9/10/2026, 9:58:34 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int ans=0;
        int flag=0;
        for(char key:m.keySet()){
            if(m.get(key)%2!=0){
                ans+=m.get(key)-1;
                flag=1;
            }
            else{
                ans+=m.get(key);
            }
        }
        if(flag==1){
            return ans+1;
        }
        return ans;
    }
}