// Last updated: 9/10/2026, 9:47:40 AM
class Solution {
    public long minimumSteps(String s) {
        long counter=0;
        long ans=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='0'){
                counter++;
            }
            if(ch=='1'){
                ans+=counter;
            }
        }
        return ans;
    }
}