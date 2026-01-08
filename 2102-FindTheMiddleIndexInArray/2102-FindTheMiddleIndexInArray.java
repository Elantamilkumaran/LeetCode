// Last updated: 1/8/2026, 3:32:25 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j < nums.length; j++){
                rightSum += nums[j];
            }
            for(int k = 0; k < i; k++){
                leftSum += nums[k];
            }
            if(leftSum - rightSum == 0) return i;
            leftSum=0;
            rightSum=0;
        }
        return -1;
    }
}