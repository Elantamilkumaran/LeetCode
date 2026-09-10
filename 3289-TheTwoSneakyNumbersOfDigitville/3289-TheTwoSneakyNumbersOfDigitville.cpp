// Last updated: 9/10/2026, 9:46:27 AM
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