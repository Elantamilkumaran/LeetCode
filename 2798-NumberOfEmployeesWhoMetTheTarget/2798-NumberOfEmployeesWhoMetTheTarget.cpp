// Last updated: 9/10/2026, 9:48:24 AM
class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        int c=0;
        for(int i=0;i<hours.size();i++){
            if(hours[i]>=target){
                c++;
            }
        }
        return c;
    }
};