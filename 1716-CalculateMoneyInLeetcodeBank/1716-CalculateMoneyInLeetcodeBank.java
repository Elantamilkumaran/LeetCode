// Last updated: 9/10/2026, 9:52:45 AM
class Solution {
    public int totalMoney(int n) {
        int min=1,add=1;
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(count==7){
                min++;
                add=min;
                count=0;
            }
            sum+=add;
            add++;
            count++;
        }
        return sum;
    }
}