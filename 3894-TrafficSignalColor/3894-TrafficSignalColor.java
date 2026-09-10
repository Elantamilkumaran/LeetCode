// Last updated: 9/10/2026, 9:44:09 AM
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0) return "Green";
        else if(timer==30) return "Orange";
        else if(timer>30 && timer<=90) return "Red";
        else return "Invalid";
    }
}