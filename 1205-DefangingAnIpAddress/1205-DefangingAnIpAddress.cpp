// Last updated: 1/8/2026, 3:33:21 PM
class Solution {
public:
    string defangIPaddr(string address) {
        string s="";
        for(int i=0;i<address.size();i++){
            if(address[i]=='.'){
                s+="[.]";
            }
            else{
                s+=address[i];
            }
        }
        return s;
    }
};