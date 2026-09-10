// Last updated: 9/10/2026, 9:52:17 AM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] a=s.split(" ");
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<k-1){
            ans.append(a[i++]);
            ans.append(" ");
        }
        ans.append(a[i]);
        return ans.toString();
    }
}