// Last updated: 9/10/2026, 9:51:35 AM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int psum=0;
        int ssum=0;
        int[] ps=new int[nums.length];
        int[] ss=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            ssum+=nums[n-i-1];
            ps[i]=psum;
            ss[i]=ssum;
        }
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp=ss[l];
            ss[l]=ss[r];
            ss[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<n;i++){
            if(ps[i]==ss[i]){
                return i;
            }
        }
        return -1;
    }
}