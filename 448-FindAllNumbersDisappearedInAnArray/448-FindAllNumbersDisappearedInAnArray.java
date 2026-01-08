// Last updated: 1/8/2026, 3:33:52 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] seats) {
        List<Integer> emptySeats = new ArrayList<>();
        for(int ticket : seats){
            seats[Math.abs(ticket)-1] = -Math.abs(seats[Math.abs(ticket)-1]);
        }
        for(int i = 0; i < seats.length; i++){
            if(seats[i] > 0) {
                emptySeats.add(i + 1);
            }
        }
        return emptySeats;
    }
}