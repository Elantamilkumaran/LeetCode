// Last updated: 1/8/2026, 3:35:03 PM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=-1;
        while(left<right){
            int width=right-left;
            int Height=Math.min(height[left],height[right]);
            max=Math.max(max,width*Height);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}