// Last updated: 9/10/2026, 9:44:47 AM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if(k==0) return nums;
        int pe=0;
        for(int num:nums){
            if(num>=0){
                pe++;
            }
        }
        if(pe==0) return nums;
        int[] a=new int[pe];
        int ind=0;
        for(int num:nums){
            if(num>=0){
                a[ind++]=num;
            }
        }
        k=k%a.length;
        int l=0;
        int r=k-1;
        while(l<r){
            int temp=a[r];
            a[r]=a[l];
            a[l]=temp;
            l++;
            r--;
        }
        l=k;
        r=a.length-1;
        while(l<r){
            int temp=a[r];
            a[r]=a[l];
            a[l]=temp;
            l++;
            r--;
        }
        l=0;
        r=a.length-1;
        while(l<r){
            int temp=a[r];
            a[r]=a[l];
            a[l]=temp;
            l++;
            r--;
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=a[idx];
                idx++;
            }
        }
        return nums;
    }
}