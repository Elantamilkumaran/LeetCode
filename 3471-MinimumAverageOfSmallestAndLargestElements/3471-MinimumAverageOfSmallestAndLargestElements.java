// Last updated: 1/8/2026, 3:31:22 PM
class Solution {
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        double avg=Double.MAX_VALUE;
        while(left<right){
            double t=(nums[left]+nums[right])/2.0;
            avg=Math.min(avg,t);
            left++;
            right--;
        }
        return avg;
    }
}