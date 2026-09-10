// Last updated: 9/10/2026, 9:50:28 AM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] array=new int[1001];
        List<Integer> list=new ArrayList<>();
        for(int[] num:nums){
            for(int i=0;i<num.length;i++){
                array[num[i]]++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==nums.length){
                list.add(i);
            }
        }
        //Collections.sort(list);
        return list;
    }
}