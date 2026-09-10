// Last updated: 9/10/2026, 9:58:43 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[k];
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int idx=0;
        while(idx<k){
            int max=0;
            int dk=0;
            for(int key:m.keySet()){
                if(max<m.get(key)){
                    max=m.get(key);
                    dk=key;
                }
            }
            ans[idx++]=dk;
            m.remove(dk);
        }
        return ans;
    }
}