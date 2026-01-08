// Last updated: 1/8/2026, 3:33:36 PM
class Solution {
public:
    string toLowerCase(string s) {
     for(int i=0;i<s.length();i++){
        s[i]=tolower(s[i]);
     }
     return s;   
    }
};