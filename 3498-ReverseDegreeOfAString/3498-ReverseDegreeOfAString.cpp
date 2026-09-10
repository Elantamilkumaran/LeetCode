// Last updated: 9/10/2026, 9:45:58 AM
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