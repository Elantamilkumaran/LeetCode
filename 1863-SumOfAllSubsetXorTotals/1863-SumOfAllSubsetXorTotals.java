// Last updated: 9/10/2026, 9:51:50 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        return sub(nums,0,0); 
    }
    public static int sub(int[] nums,int i,int s){
        if(i==nums.length) return s;
        return sub(nums,i+1,s^nums[i]) + sub(nums,i+1,s);
    }
}