// Last updated: 9/10/2026, 9:54:58 AM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int step=0;
        int refill=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                step++;
                capacity-=plants[i];
            }
            else{
                step=step+i;
                capacity=refill;
                step=step+i+1;
                capacity-=plants[i];
            }
        }
        return step;
    }
}