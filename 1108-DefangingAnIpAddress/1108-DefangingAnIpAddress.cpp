// Last updated: 9/10/2026, 9:55:25 AM
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