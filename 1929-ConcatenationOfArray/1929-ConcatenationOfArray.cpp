// Last updated: 9/10/2026, 9:51:42 AM
class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=nums.size();
        for(int i=0;i<n;i++){
            nums.push_back(nums[i]);
        }
        return nums;
    }
};