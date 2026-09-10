// Last updated: 9/10/2026, 9:48:47 AM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            m.put(A[i],m.getOrDefault(A[i],0)+1);
            m.put(B[i],m.getOrDefault(B[i],0)+1);
            int sum=0;
            for(int key:m.keySet()){
                if(m.get(key)>1){
                    sum+=m.get(key);
                }
            }
            ans[i]=sum/2;
        }
        return ans;
    }
}