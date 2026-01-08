// Last updated: 1/8/2026, 3:33:47 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i : candyType){
            set.add(i);
        }
        return Math.min(set.size(),candyType.length/2);
    }
}