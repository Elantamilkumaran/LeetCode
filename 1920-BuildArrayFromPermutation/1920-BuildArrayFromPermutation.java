// Last updated: 9/10/2026, 9:51:45 AM
class Solution {
    public int[] buildArray(int[] nums) {
        //vector<int> ans;
        //ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            //ans.add(nums[nums[i]]);
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}