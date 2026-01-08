// Last updated: 1/8/2026, 3:32:49 PM
class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
      string ans=s;
      for(int i=0;i<indices.size();i++){
        ans[indices[i]]=s[i];
      }  
      return ans;
    }
};