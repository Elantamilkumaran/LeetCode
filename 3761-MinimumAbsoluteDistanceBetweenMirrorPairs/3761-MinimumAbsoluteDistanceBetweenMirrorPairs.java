// Last updated: 9/10/2026, 9:44:50 AM
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                min=Math.min(min,i-m.get(nums[i]));
            }
            m.put(reverse(nums[i]),i);
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
    public int reverse(int n){
        int rev=0;
        while(n!=0){
            rev=(rev*10)+n%10;
            n/=10;
        }
        return rev;
    }
}