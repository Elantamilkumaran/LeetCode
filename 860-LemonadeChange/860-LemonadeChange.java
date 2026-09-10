// Last updated: 9/10/2026, 9:56:29 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        if(bills[0]!=5) return false;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10){
                ten++;
                if(five>0) five--;
                else return false;
            }
            else{
                twenty++;
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3) five-=3;
                else return false;
            }
        }
        return true;
    }
}