// Last updated: 9/10/2026, 9:44:07 AM
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] ps=new int[nums.length];
        int[] ss=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            ps[i]=max;
        }
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            ss[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(ps[i]-ss[i]<=k){
                return i;
            }
        }
        return -1;
    }
}