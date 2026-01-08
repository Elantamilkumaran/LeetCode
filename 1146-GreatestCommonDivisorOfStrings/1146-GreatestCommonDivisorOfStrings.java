// Last updated: 1/8/2026, 3:33:23 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdLength=gcd(str1.length(),str2.length());
        return str2.substring(0,gcdLength);
    }

    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}