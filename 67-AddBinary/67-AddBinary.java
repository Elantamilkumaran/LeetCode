// Last updated: 9/10/2026, 10:01:02 AM
class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder sb=new StringBuilder();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            for(int i=0;i<l1-l2;i++){
                s2="0"+s2;
            }
        }
        else{
            for(int i=0;i<l2-l1;i++){
                s1="0"+s1;
            }
        }
        l1=s1.length();
        int carry=0;
        int sum=0;
        while(--l1>=0){
            int n1=s1.charAt(l1)-'0';
            int n2=s2.charAt(l1)-'0';
            sum=((n1+n2)+carry);
            carry=sum/2;
            sb.append(sum%2);
        }
        if(carry>0){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
    }
}