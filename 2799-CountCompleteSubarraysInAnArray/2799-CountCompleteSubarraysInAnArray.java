// Last updated: 9/10/2026, 9:48:33 AM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int l=0;
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            while(m.size()==hs.size()){
                ans+=(nums.length-i);
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0) m.remove(nums[l]);
                l++;
            }
        }
        return ans;
    }
}