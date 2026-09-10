// Last updated: 9/10/2026, 9:55:08 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int bc=0;
        int ac=0;
        int lc=0;
        int oc=0;
        int nc=0;
        for(char ch:text.toCharArray()){
            if(ch=='b') bc++;
            else if(ch=='a') ac++;
            else if(ch=='l') lc++;
            else if(ch=='o') oc++;
            else if(ch=='n') nc++;
        }
        return Math.min(Math.min(bc,ac),Math.min(nc,Math.min(lc/2,oc/2)));
    }
}