// Last updated: 9/10/2026, 10:00:11 AM
class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int count=0;
        for(int num:nums){
            if(count<=0){
                res=num;
            }
            if(res==num) count++;
            if(res!=num) count--;
        }
        return res;
    }
}