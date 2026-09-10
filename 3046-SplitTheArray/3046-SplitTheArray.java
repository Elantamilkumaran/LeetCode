// Last updated: 9/10/2026, 9:47:14 AM
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)>2) return false;
        }
        return true;
    }
}