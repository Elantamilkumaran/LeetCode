// Last updated: 9/10/2026, 9:47:49 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}