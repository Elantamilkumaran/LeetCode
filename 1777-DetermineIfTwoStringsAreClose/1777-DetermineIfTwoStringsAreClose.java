// Last updated: 1/8/2026, 3:32:47 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<word1.length();i++){
            m1.put(word1.charAt(i),m1.getOrDefault(word1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<word2.length();i++){
            m2.put(word2.charAt(i),m2.getOrDefault(word2.charAt(i),0)+1);
        }
        
        if(!(m1.keySet().equals(m2.keySet()))){
            return false;
        }
        ArrayList<Integer> l1=new ArrayList<>(m1.values());
        ArrayList<Integer> l2=new ArrayList<>(m2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}