// Last updated: 9/10/2026, 9:47:36 AM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int l=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            m.put(n,m.getOrDefault(n,0)+1);
            while(m.get(n)>k){
                m.put(nums[l],m.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}