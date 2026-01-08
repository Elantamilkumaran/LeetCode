// Last updated: 1/8/2026, 3:31:17 PM
class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        int count=0;
        sort(nums.begin(),nums.end());
        vector<int> ans;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]==nums[i+1]) count++;
            if(count==1){
                ans.emplace_back(nums[i]);
                count=0;
            }
        }
        return ans;
    }
};