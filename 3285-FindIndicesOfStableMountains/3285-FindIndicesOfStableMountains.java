// Last updated: 9/10/2026, 9:46:19 AM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<height.length;i++){
            if(height[i]>threshold && i!=height.length-1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}