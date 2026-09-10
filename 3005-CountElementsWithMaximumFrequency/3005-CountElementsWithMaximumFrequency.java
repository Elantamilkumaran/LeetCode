// Last updated: 9/10/2026, 9:47:26 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int max=0;
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
            if(m.get(num)>max) max=m.get(num);
        }
        int ans=0;
        for(int key:m.keySet()){
            if(m.get(key)==max){
                ans+=max;
            }
        }
        return ans;
    }
}