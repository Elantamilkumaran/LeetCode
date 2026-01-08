// Last updated: 1/8/2026, 3:32:30 PM
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