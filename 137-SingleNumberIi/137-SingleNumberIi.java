// Last updated: 1/8/2026, 3:34:34 PM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}