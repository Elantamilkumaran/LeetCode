// Last updated: 1/8/2026, 3:32:38 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int d = 0;
        for(int i = 0; i < gain.length; i++){
            d += gain[i];
            if(d > max) max = d;
        }
        return max;
    }
}