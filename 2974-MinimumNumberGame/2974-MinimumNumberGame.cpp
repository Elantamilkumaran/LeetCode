// Last updated: 9/10/2026, 9:47:33 AM
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