// Last updated: 9/10/2026, 9:59:41 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        if(nums.length!=hs.size()){
            return true;
        }
        return false; 
    }
}