// Last updated: 9/10/2026, 9:55:22 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int t=arr[i];
            arr[i]=max;
            if(max<t) max=t;
        }
        return arr;
    }
}