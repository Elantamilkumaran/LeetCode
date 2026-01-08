// Last updated: 1/8/2026, 3:34:46 PM
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n=nums.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int small=i;
                if(nums[j]<nums[small]){
                    small=j;
                }
                int t=nums[small];
                nums[small]=nums[i];
                nums[i]=t;
            }
        }
    }
};