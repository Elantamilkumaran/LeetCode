// Last updated: 9/10/2026, 9:57:00 AM
class Solution {
public:
    string toLowerCase(string s) {
     for(int i=0;i<s.length();i++){
        s[i]=tolower(s[i]);
     }
     return s;   
    }
};