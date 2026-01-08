// Last updated: 1/8/2026, 3:33:15 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr) m.put(i,m.getOrDefault(i,0)+1);
        int n1=m.size();
        HashSet<Integer> s=new HashSet<>();
        for(int key:m.keySet()) s.add(m.get(key));
        int n2=s.size();
        if(n1==n2) return true;
        else return false;
    }
}