// Last updated: 9/10/2026, 9:57:31 AM
class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}