// Last updated: 9/10/2026, 9:58:07 AM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> q=new PriorityQueue<>((a,b)->(m.get(b)-m.get(a)));
        for(char key:m.keySet()){
            q.add(key);
        }
        StringBuilder sb=new StringBuilder();
        while(q.size()>0){
            char ch=q.poll();
            for(int i=0;i<m.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}