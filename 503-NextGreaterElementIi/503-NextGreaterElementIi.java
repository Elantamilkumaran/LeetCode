// Last updated: 9/10/2026, 9:57:57 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int g=nextGreater(i,nums);
            ans[i]=g;
        }
        return ans;    
    }
    public int nextGreater(int index,int[] nums){
        int curr=nums[index];
        int n=nums.length;
        for(int i=index+1;i<n;i++){
            if(curr<nums[i]) return nums[i];
        }
        for(int i=0;i<index;i++){
            if(curr<nums[i]) return nums[i];
        }
        return -1;
    }
}