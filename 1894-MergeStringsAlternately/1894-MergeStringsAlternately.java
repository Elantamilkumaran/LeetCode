// Last updated: 1/8/2026, 3:32:34 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int max=word1.length()>=word2.length()?word1.length():word2.length();
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        for(int n=0;n<max;n++){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}