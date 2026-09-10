// Last updated: 9/10/2026, 9:52:21 AM
class Solution {
    public int secondHighest(String s) {
        int max=-1,prev=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>max){
                    prev=max;
                    max=num;
                }
                else if(num<max && num>prev){
                    prev=num;
                }
            }
        }
        return prev;
    }
}