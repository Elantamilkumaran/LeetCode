// Last updated: 9/10/2026, 9:53:19 AM
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