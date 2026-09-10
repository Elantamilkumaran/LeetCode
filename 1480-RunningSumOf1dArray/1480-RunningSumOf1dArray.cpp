// Last updated: 9/10/2026, 9:53:34 AM
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> sum;
        for(int i=1;i<=nums.size();i++){
            int csum=0;
            for(int j=1;j<=i;j++){
                csum+=nums[j-1];
            }
            sum.emplace_back(csum);
        }
        return sum;
    }
};