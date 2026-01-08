// Last updated: 1/8/2026, 3:31:29 PM
class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int> arr;
        sort(nums.begin(),nums.end());
        int ai=0,bi=1;
        for(int i=0;i<nums.size();i+=2){
            arr.emplace_back(nums[i+1]);
            arr.emplace_back(nums[i]);
        }
        return arr;
    }
};