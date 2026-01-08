// Last updated: 1/8/2026, 3:33:39 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft=new int [nums.length];
        int[] sumRight=new int [nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sumLeft[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sumRight[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sumRight[i]==sumLeft[i]){
                return i;
            }
        }
        return -1;
    }
}