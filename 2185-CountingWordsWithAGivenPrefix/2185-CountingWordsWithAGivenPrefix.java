// Last updated: 9/10/2026, 9:50:38 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)) count++;
        }
        return count;
    }
}