// Last updated: 9/10/2026, 9:52:01 AM
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0,ans=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
                if(i>j){
                    j=i;
                }
            }
        }
        return ans;
    }
}