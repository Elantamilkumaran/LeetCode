// Last updated: 1/8/2026, 3:31:30 PM
class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
         vector<int> ans;
        for(int i=0;i<words.size();i++){
            for(int j=0;j<words[i].size();j++){
                if(x==words[i][j]){
                    ans.push_back(i);
                    break;
                }
            }
        }
        return ans;
    }
};