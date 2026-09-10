// Last updated: 9/10/2026, 9:52:04 AM
class Solution {
    public String sortSentence(String s) {
        String[] a1=s.split(" ");
        String[] ans=new String[a1.length];
        for(int i=0;i<a1.length;i++){
            int ind=a1[i].charAt(a1[i].length()-1)-'0';
            ans[ind-1]=a1[i].substring(0,a1[i].length()-1);
        }
        return String.join(" ",ans);
    }
}