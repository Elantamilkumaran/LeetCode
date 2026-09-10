// Last updated: 9/10/2026, 10:00:36 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> s=new ArrayList<>();
        Arrays.sort(nums);
        sub(nums,0,s,a);
        HashSet<List<Integer>> hs=new HashSet<>(a);
        return new ArrayList(hs);
    }
    public static void sub(int[] nums,int i,List<Integer> s,List<List<Integer>> a){
        if(i==nums.length){
            a.add(new ArrayList<>(s));
            return;
        }
        s.add(nums[i]);
        sub(nums,i+1,s,a);
        s.remove(s.size()-1);
        sub(nums,i+1,s,a);
    } 
}