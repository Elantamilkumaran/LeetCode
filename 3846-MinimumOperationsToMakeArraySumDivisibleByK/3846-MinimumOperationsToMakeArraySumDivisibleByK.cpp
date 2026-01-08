// Last updated: 1/8/2026, 3:31:10 PM
class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int ans=0;
        for(int n:nums){
            ans+=n;
        }
        return ans%k;
    }
};