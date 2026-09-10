// Last updated: 9/10/2026, 9:51:27 AM
class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int maxD=0;
        int ans=0;
        for(int i=properties.length-1;i>=0;i--){
            if(properties[i][1]<maxD){
                ans++;
            }
            maxD=Math.max(properties[i][1],maxD);
        }
        return ans;
    }
}