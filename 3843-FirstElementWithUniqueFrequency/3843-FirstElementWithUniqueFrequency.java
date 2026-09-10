// Last updated: 9/10/2026, 9:44:36 AM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        int[] f1=new int[100001];
        for(int i:nums){
            f1[i]++;
        }
        int[] f2=new int[100001];
        for(int i:f1){
            f2[i]++;
        }
        for(int n:nums){
            int k=f1[n];
            if(f2[k]==1){
                return n;
            }
        }
        return -1;
    }
}
