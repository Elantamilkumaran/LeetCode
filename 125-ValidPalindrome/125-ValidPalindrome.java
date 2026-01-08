// Last updated: 1/8/2026, 3:34:36 PM
class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}