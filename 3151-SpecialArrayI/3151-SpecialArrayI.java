// Last updated: 9/10/2026, 9:46:48 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        int flag;
        if(nums[0]%2==0) flag=0;
        else flag=1;
        for(int num:nums){
            if(flag==0 && num%2==0){
                flag=1;
            }
            else if(flag==1 && num%2!=0){
                flag=0;
            }
            else return false;
        }
        return true;
    }
}