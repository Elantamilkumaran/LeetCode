// Last updated: 1/8/2026, 3:32:45 PM
class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        vector<int> s;
        for(int i=0;i<accounts.size();i++){
            int sum=0;
            for(int j=0;j<accounts[i].size();j++){
                sum+=accounts[i][j];
            }
            s.emplace_back(sum);
        } 
        sort(s.begin(),s.end());
        return s[s.size()-1];
    }
};