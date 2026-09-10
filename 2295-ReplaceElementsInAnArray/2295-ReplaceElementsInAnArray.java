// Last updated: 9/10/2026, 9:50:25 AM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<operations.length;i++){
            if(m.containsKey(operations[i][0])){
                nums[m.get(operations[i][0])]=operations[i][1];
                int value=m.get(operations[i][0]);
                m.remove(operations[i][0]);
                m.put(operations[i][1],value);
            }
        }
        return nums;
    }
}