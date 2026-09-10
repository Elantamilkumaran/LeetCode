// Last updated: 9/10/2026, 9:50:46 AM
class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos;
        vector<int> neg;
        vector<int> result;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<0){
                neg.emplace_back(nums[i]);
            }
            else{
                pos.emplace_back(nums[i]);
            }
        }
        for(int i=0;i<(nums.size()/2);i++){
            result.emplace_back(pos[i]);
            result.emplace_back(neg[i]);
        }
        return result;
    }
};