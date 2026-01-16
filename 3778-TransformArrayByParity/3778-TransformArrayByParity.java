// Last updated: 1/16/2026, 11:05:12 AM
class Solution {
    public int[] transformArray(int[] nums) {
        /*for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }
        Arrays.sort(nums);
        return nums;*/
        int[] ans=new int[nums.length];
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even++;
        }
        for(int i=0;i<even;i++) ans[i]=0;
        for(int i=even;i<nums.length;i++) ans[i]=1;
        return ans;
    }
}