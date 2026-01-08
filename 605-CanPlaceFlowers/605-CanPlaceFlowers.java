// Last updated: 1/8/2026, 3:33:46 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        if(n==0) return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                    count++;
                    if(count==n){
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}