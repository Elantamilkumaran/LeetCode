// Last updated: 9/10/2026, 9:44:12 AM
class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        int sum=0;
        for(char ch:s.toCharArray()){
            m1.put(ch,m1.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            char c=ch;
            char m;
            if(Character.isLetter(c)){
                m=(char)(97+(122-c));
            }
            else{
                m=(char)(48+(57-c));
            }
            if(hs.contains(c)){
                continue;
            }
            m1.putIfAbsent(m,0);
            sum+=Math.abs(m1.get(c)-m1.get(m));
            hs.add(c);
            hs.add(m);
        }
        return sum;
    }
}