// Last updated: 1/8/2026, 3:32:36 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(int key:m.keySet()){
            if(m.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}