// Last updated: 9/10/2026, 9:44:37 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String word:words){
            int sum=0;
            for(char ch: word.toCharArray()){
                sum+=(weights[ch-'a']);
            }
            sb.append((char)(122-(sum%26)));
        }
        return sb.toString();
    }
}