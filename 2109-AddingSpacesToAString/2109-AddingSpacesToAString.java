// Last updated: 9/10/2026, 9:51:00 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans=new StringBuilder();
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(spaces[ind]==i){
                ans.append(" ");
                ans.append(s.charAt(i));
                ind++;
                if(ind==spaces.length) ind=0;
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}