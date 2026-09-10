// Last updated: 9/10/2026, 9:47:02 AM
class Solution {
public:
    int scoreOfString(string s) {
        int sum=0;
        for(int i=0;i<s.size()-1;i++){
            sum+=(abs((s[i]-s[i+1])));
        }
        return sum;
    }
};