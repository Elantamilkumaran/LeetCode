// Last updated: 1/8/2026, 3:32:32 PM
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