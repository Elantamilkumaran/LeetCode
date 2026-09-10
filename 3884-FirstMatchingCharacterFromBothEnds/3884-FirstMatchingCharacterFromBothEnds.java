// Last updated: 9/10/2026, 9:44:20 AM
class Solution {
    public int firstMatchingIndex(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<=high){
            if(s.charAt(low)==s.charAt(high)){
                return low;
            }
            low++;
            high--;
        }
        return -1;
    }
}