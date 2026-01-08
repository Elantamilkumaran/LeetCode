// Last updated: 1/8/2026, 3:33:01 PM
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