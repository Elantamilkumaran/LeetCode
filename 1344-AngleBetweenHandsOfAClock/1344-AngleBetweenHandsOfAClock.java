// Last updated: 9/10/2026, 9:54:19 AM
class Solution {
    public double angleClock(int hour, int minutes) {
        double hour_angle=(hour%12)*30+minutes*0.5;
        double min_angle=minutes*6;
        double ans=Math.abs(hour_angle-min_angle);
        return Math.min(ans,360-ans);
    }
}