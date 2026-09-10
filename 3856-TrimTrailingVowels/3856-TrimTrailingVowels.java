// Last updated: 9/10/2026, 9:44:33 AM
class Solution {
    public String trimTrailingVowels(String s) {
        int count=0;
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            else break;
        }
        return s.substring(0,n-count+1); 
    }
}