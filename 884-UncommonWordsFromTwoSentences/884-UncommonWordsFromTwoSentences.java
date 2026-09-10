// Last updated: 9/10/2026, 9:56:11 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] sa1=s1.split(" ");
        String[] sa2=s2.split(" ");
        List<String> ans=new ArrayList<>();
        HashMap<String,Integer> m=new HashMap<>();
        for(String s:sa1){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        for(String s:sa2){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        for(String key:m.keySet()){
            if(m.get(key)==1){
                ans.add(key);
            }
        }
        return ans.toArray(new String[0]);
    }
}