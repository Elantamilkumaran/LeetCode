// Last updated: 9/10/2026, 9:53:29 AM
class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        int s=nums.size();
        int sum=0;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(nums[i]==nums[j]){
                    sum+=1;
                }
            }
        }
        return sum;
    }
};