// Last updated: 9/10/2026, 9:51:14 AM
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        HashSet<Integer> s3=new HashSet<>();
        for(int num:nums1) s1.add(num);
        for(int num:nums2) s2.add(num);
        for(int num:nums3) s3.add(num);
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int num:s1) m.put(num,m.getOrDefault(num,0)+1);
        for(int num:s2) m.put(num,m.getOrDefault(num,0)+1);
        for(int num:s3) m.put(num,m.getOrDefault(num,0)+1);
        List<Integer> a=new ArrayList<>();
        for(int key:m.keySet()){
            if(m.get(key)>1){
                a.add(key);
            }
        }
        return a;
    }
}