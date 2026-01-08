// Last updated: 1/8/2026, 3:31:15 PM
class Solution {
public:
    int reverseDegree(string s) {
        int num;
        int s1=0;
        for(int i=0;i<s.size();i++){
            num=26-(s[i]-'a');
            s1+=(num*(i+1));
        }
        return s1;
    }
};