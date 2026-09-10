// Last updated: 9/10/2026, 9:53:25 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottles=empty/numExchange;
            total+=newBottles;
            empty=(empty%numExchange)+newBottles;
        }
        return total;
    }
}