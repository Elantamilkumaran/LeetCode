// Last updated: 1/8/2026, 3:33:42 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[2];
        Arrays.sort(nums);
        int n=nums.length;
        int actual_sum=0;
        int expected_sum=(n*(n+1))/2;
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
            actual_sum+=num;
        }
        for(int ch:m.keySet()){
            if(m.get(ch)==2){
             ans[0]=ch;
             break;   
            }
        }
        ans[1]=expected_sum-(actual_sum-ans[0]);
        return ans;
    }
}