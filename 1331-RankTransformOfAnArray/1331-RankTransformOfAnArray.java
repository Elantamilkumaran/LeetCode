// Last updated: 9/10/2026, 9:55:12 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer> m=new HashMap<>();
        int idx=0;
        int ind=1;
        while(idx<arr.length){
            if(m.containsKey(arr[idx])){
                idx++;
            }
            else{
                m.put(arr[idx],ind++);
                idx++;
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=m.get(ans[i]);
        }
        return ans;
    }
}