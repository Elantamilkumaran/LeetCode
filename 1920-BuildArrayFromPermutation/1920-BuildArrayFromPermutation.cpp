// Last updated: 9/10/2026, 9:51:51 AM
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            ans.push_back(nums[nums[i]]);
        }
        return ans;
    }
};