// Last updated: 9/10/2026, 9:51:09 AM
class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int num=colors[i];
            for(int j=i+1;j<n;j++){
                if(num!=colors[j]){
                    ans=Math.max(ans,j-i);
                }
            }
        }  
        return ans;
    }
}