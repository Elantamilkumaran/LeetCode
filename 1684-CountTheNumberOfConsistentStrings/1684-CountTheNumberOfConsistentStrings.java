// Last updated: 9/10/2026, 9:52:59 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int t=0;
            for(int j=0;j<s.length();j++){
                if(!allowed.contains(s.charAt(j)+"")) t=1;
            }
            if(t==1) continue;
            else count++;
        }
        return count;
    }
}