// Last updated: 9/10/2026, 9:50:17 AM
class Solution {
    public int countAsterisks(String s) {
        int bar=0;
        int star=0,temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(bar==0) bar=1;
                else bar=0;
            }
            if(bar==0 && s.charAt(i)=='*') star++;
            if(bar==1 && s.charAt(i)=='*') temp++;
        }
        if(bar==1) star+=temp;
        return star;
    }
}