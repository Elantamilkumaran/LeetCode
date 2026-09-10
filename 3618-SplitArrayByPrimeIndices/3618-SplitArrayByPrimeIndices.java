// Last updated: 9/10/2026, 9:45:32 AM
class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        int[] p=new int[nums.length+1];
        for(int i=2;i<=n;i++){
            p[i]=1;
        }
        for(int i=2;i*i<=n;i++){
            if(p[i]==1){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=0;
                }
            }
        }
        long sumA=0;
        long sumB=0;
        for(int i=0;i<n;i++){
            if(p[i]==1){
                sumA+=nums[i];
            }
            else{
                sumB+=nums[i];
            }
        }
        return Math.abs(sumA-sumB);
    }
}