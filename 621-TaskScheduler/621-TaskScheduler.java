// Last updated: 9/10/2026, 9:57:28 AM
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> m=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int mc=0;
        for(char ch:tasks){
            m.put(ch,m.getOrDefault(ch,0)+1);
            if(m.get(ch)>max){
                max=m.get(ch);
            }
        }
        for(char key:m.keySet()){
            if(m.get(key)==max) mc++;
        }
        int ans=(((max-1)*(n+1))+mc);
        if(ans>tasks.length) return ans;
        else return tasks.length;
    }
}