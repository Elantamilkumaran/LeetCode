// Last updated: 9/10/2026, 9:54:01 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> a=new ArrayList<>(candies.length);
        int max=0;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        for(int i:candies){
            if(i+extraCandies>=max){
                a.add(true);
            }
            else{
                a.add(false);
            }
        }
        return a;
    }
}