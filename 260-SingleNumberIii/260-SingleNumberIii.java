// Last updated: 1/8/2026, 3:34:13 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[2];
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int key:m.keySet()){
            if(m.get(key)==1){
                ans[i]=key;
                i++;
            }
        }
        return ans;
    }
}