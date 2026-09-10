// Last updated: 9/10/2026, 9:49:11 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int s=nums.length;
        int es=0;
        for(int i=0;i<s;i++) es+=nums[i];
        int ds=0;
        int d;
        for(int i=0;i<s;i++){
            int n=nums[i];
            while(n!=0){
                d=n%10;
                ds+=d;
                n/=10;
            }
        }
        return Math.abs(es-ds);
    }
}