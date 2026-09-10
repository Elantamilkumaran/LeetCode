// Last updated: 9/10/2026, 9:45:29 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int index=0;
        while(index+1<n && nums[index]<nums[index+1]){
            index++;
        }
        if(index==0) return false;
        int peak1=index;
        while(index+1<n && nums[index]>nums[index+1]){
            index++;
        }
        if(index==peak1) return false;
        int depth=index;
        while(index+1<n && nums[index]<nums[index+1]){
            index++;
        }
        return (index==n-1) && peak1<depth && depth<n-1;
    }
}