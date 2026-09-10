// Last updated: 9/10/2026, 9:47:45 AM
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