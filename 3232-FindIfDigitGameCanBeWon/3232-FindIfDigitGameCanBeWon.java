// Last updated: 9/10/2026, 9:46:31 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int ss=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                ss+=nums[i];
            }
            else{
                ds+=nums[i];
            }
        }
        return (ss==ds)?false:true;
    }
}