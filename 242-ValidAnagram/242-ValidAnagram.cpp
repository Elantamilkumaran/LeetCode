// Last updated: 1/8/2026, 3:34:16 PM
class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> m1;
        for(char i:s){
            m1[i]++;
        }
        map<char,int> m2;
        for(char i:t){
            m2[i]++;
        }
        if(m1==m2){
            return true;
        }
        else{
            return false;
        }
    }
};