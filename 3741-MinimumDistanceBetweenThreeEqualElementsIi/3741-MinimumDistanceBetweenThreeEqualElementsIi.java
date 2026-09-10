// Last updated: 9/10/2026, 9:44:54 AM
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        if(n<=2) return -1;
        HashMap<Integer,List<Integer>> m=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            m.putIfAbsent(nums[i],new ArrayList<>());
            List<Integer> list=m.get(nums[i]);
            list.add(i);
            if(list.size()>=3){
                int k=list.size();
                int l1=list.get(k-3);
                int l3=list.get(k-1);
                ans=Math.min(ans,2*(l3-l1));
            }
        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}