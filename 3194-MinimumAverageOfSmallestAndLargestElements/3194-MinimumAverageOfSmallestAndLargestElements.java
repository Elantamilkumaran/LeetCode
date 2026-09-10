// Last updated: 9/10/2026, 9:46:41 AM
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