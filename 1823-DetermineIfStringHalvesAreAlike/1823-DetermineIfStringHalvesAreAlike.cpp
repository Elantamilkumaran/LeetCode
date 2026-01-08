// Last updated: 1/8/2026, 3:32:41 PM
class Solution {
public:
    bool halvesAreAlike(string s) {
        int n=s.length();
        string a="";
        string b="";
        for(int i=0;i<n;i++){
            if(i<n/2){
                a+=s[i];
            }
            else{
                b+=s[i];
            }
        }
        int av=0;
        int bv=0;
        for(int i=0;i<a.length();i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                av++;
            }
        }
         for(int i=0;i<b.length();i++){
            if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U'){
                bv++;
            }
        }
        if(av==bv){
            return true;
        }
        else{
            return false;
        }
    }
};