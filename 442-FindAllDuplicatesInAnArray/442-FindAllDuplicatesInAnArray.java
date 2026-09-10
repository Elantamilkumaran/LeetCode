// Last updated: 9/10/2026, 9:58:17 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        List<Integer> l=new ArrayList<>();
        for(int key:m.keySet()){
            if(m.get(key)>1) l.add(key);
        }
        return l;
    }
}