// Last updated: 1/8/2026, 3:32:42 PM
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