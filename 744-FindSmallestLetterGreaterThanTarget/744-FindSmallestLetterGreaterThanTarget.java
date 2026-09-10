// Last updated: 9/10/2026, 9:56:57 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(letters[mid]<=target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return letters[low%letters.length];
    }
}