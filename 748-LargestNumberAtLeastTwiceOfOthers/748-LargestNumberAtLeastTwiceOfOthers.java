// Last updated: 1/8/2026, 3:33:35 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int maxin=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxin=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=maxin && (nums[i]*2)>max){
                return -1;
            }
        }
        return maxin;
    }
}