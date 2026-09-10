// Last updated: 9/10/2026, 9:53:09 AM
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int res[]=new int[nums.length];
        int idx=0;
        while(!m.isEmpty()){
            int mf=Integer.MAX_VALUE;
            int v=Integer.MIN_VALUE;
            for(int key:m.keySet()){
                int freq=m.get(key);
                if(freq<mf || ((freq==mf) && key>v)){
                    mf=freq;
                    v=key;
                }
            }
            for(int i=0;i<mf;i++){
                res[idx++]=v;
            }
            m.remove(v);
        }
        return res;
    }
}