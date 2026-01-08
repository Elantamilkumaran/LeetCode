// Last updated: 1/8/2026, 3:32:43 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        int count=0;
        Arrays.sort(nums);
        while(left<right){
            if((nums[left]+nums[right])==k){
                count++;
                left++;
                right--;
            }
            else if((nums[left]+nums[right])<k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}