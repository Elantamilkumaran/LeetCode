// Last updated: 9/10/2026, 9:47:37 AM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] a=new int[2];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                }
            }
        }
        a[0]=count;
        count=0;
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    count++;
                    break;
                }
            }
        }
        a[1]=count;
        return a;
    }
}