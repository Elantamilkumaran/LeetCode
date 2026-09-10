// Last updated: 9/10/2026, 9:55:42 AM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        HashMap<Character,Integer> m1=new HashMap<>();
        for(char ch:chars.toCharArray()){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        for(String word:words){
            HashMap<Character,Integer> m2=new HashMap<>();
            for(char ch:word.toCharArray()){
                m2.put(ch,m2.getOrDefault(ch,0)+1);
            }
            int flag=1;
            for(char ch:word.toCharArray()){
                if(!m1.containsKey(ch) || !(m1.get(ch)>=m2.get(ch))){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                sum+=word.length();
            }
        }
        return sum;
    }
}