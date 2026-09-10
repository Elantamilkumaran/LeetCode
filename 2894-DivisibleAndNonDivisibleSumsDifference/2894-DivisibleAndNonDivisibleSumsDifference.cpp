// Last updated: 9/10/2026, 9:47:48 AM
class Solution {
public:
    int differenceOfSums(int n, int m) {
        vector<int> v;
        vector<int> v1;
        int s1=0,s2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                v.emplace_back(i);
            }
            else{
                v1.emplace_back(i);
            }
        }
        for(auto it=v.begin();it!=v.end();it++){
            s1+=(*it);
        }
        for(auto it=v1.begin();it!=v1.end();it++){
            s2+=(*it);
        }
        return s1-s2;
    }
};