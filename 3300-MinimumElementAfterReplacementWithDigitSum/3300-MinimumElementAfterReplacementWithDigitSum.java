// Last updated: 9/10/2026, 9:46:16 AM
class Solution {
    public int minElement(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum<min) min=sum;
        }
        return min;
    }
}