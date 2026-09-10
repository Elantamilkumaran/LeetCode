// Last updated: 9/10/2026, 9:54:54 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l=0;
        int c=0;
        int e=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                c++;
                e=0;
            }
            while(c==k){
                
                if(nums[l]%2==1){
                    c--;
                    l++;
                    e++;
                    break;
                }
                l++;
                e++;
            }
            ans+=e;
        }
        return ans;
    }
}