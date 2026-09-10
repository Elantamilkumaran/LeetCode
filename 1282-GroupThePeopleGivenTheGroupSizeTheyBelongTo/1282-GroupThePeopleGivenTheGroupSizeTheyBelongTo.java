// Last updated: 9/10/2026, 9:54:42 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] gs) {
        List<List<Integer>> a=new ArrayList<>();
        HashMap<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<gs.length;i++){
            int s=gs[i];
            m.putIfAbsent(s,new ArrayList<>());
            m.get(s).add(i);
            if(m.get(s).size()==s){
                a.add(new ArrayList<>(m.get(s)));
                m.get(s).clear();
            }
        }
        return a;
    }
}