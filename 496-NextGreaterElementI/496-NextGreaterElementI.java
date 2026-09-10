// Last updated: 9/10/2026, 9:58:01 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int idx=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx=j;
                    break;
                }
            }
            int v=-1;
            for(int j=idx;j<nums2.length;j++){
                if(nums1[i]<nums2[j]){
                    v=nums2[j];
                    break;
                }
            }
            ans[i]=v;
        }
        return ans;
    }
}