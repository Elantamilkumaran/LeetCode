// Last updated: 1/8/2026, 3:33:13 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> l1=new HashSet<>();
        for(int i:nums1) l1.add(i);
        HashSet<Integer> l2=new HashSet<>();
        for(int i:nums2) l2.add(i);
        ArrayList a1= new ArrayList<>();
        ArrayList a2= new ArrayList<>();
        for(int i:l1){
            if(!l2.contains(i)){
                a1.add(i);
            }
        }
        for(int i:l2){
            if(!l1.contains(i)){
                a2.add(i);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(a1);
        ans.add(a2);
        return ans;
    }
}