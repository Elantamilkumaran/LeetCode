// Last updated: 9/10/2026, 9:46:12 AM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        TreeMap<String,Integer> t=new TreeMap<>();
        for(int i=0;i<responses.size();i++){
            HashSet<String> s=new HashSet<>(responses.get(i));
            for(String word:s){
                t.put(word,t.getOrDefault(word,0)+1);
            }
        }
        int max=0;
        String k="";
        for(String key:t.keySet()){
            if(t.get(key)>max){
                max=t.get(key);
                k=key;
            }
        }
        return k;
    }
}