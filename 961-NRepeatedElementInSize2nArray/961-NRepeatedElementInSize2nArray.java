// Last updated: 9/10/2026, 9:55:59 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)>1) return key;
        }
        return 0;
    }
}