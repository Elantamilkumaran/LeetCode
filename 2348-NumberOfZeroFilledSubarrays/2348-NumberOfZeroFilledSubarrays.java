// Last updated: 9/10/2026, 9:50:12 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long run=0,count=0;
        for(int num:nums){
            if(num==0) run++;
            else run=0;
            count+=run;
        }
        return count;
    }
}