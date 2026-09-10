// Last updated: 9/10/2026, 9:45:45 AM
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