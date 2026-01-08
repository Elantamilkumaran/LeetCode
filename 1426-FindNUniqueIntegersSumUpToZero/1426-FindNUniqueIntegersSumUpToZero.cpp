// Last updated: 1/8/2026, 3:33:07 PM
class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> p;
        if(n%2!=0){
            p.emplace_back(0);
        }
        for(int i=1;i<=n/2;i++){
            p.emplace_back(i);
            p.emplace_back(-i);
        }
        return p;
    }
};