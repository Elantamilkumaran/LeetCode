// Last updated: 9/10/2026, 9:57:47 AM
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans=new StringBuilder();
        /*if(k>s.length()){
            k=s.length();
            for(int i=k-1;i>=0;i--){
                ans.append(s.charAt(i));
            }
            return ans.toString();
        }*/
        String rev="";
        int count=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(count==0){
                rev=s.charAt(i)+rev;
                m++;
                if(m==k){
                    count=1;
                    m=0;
                    ans.append(rev);
                    rev="";
                }
            }
            else{
                ans.append(s.charAt(i));
                m++;
                if(m==k){
                    count=0;
                    m=0;
                }
            }
        }
        if (count == 0) {
            ans.append(rev);
        }
        return ans.toString();
    }
}