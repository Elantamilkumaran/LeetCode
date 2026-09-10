// Last updated: 9/10/2026, 9:59:37 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                int prev=m.get(nums[i]);
                if(i-prev<=k){
                    return true;
                }
            }
            m.put(nums[i],i);
        }
        return false;
    }
}