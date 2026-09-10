// Last updated: 9/10/2026, 9:49:34 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                i++;
            }
        }
        int[] ans=new int[nums.length];
        int ind=0;
        for(int num:nums){
            if(num!=0){
                ans[ind]=num;
                ind++;
            }
        }
        for(int i=ind;i<nums.length;i++){
            ans[i]=0;
        }
        return ans;
    }
}