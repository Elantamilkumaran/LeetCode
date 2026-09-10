// Last updated: 9/10/2026, 9:54:30 AM
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