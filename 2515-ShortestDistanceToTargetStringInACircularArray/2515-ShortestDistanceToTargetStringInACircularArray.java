// Last updated: 9/10/2026, 9:49:19 AM
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        if(words[startIndex].equals(target)) return 0;
        int bi=startIndex;
        int bs=1;
        int fi=startIndex;
        int fs=1;
        while(fs!=n){
            if(words[(fi+1)%n].equals(target)){
                return fs;
            }
            else{
                fi=(fi+1)%n;
                fs++;
            }
            if(words[(bi-1+n)%n].equals(target)){
                return bs;
            }
            else{
                bi=(bi-1+n)%n;
                bs++;
            }
        }
        return -1;
    }
}