// Last updated: 9/10/2026, 9:51:18 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans+=(Math.abs(seats[i]-students[i]));
        }
        return ans;
    }
}