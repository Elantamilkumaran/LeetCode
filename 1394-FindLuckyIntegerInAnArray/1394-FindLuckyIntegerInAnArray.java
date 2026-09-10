// Last updated: 9/10/2026, 9:54:02 AM
class Solution {
    public int findLucky(int[] arr) {
        int[] A=new int[501];
        for(int i=0;i<arr.length;i++){
            A[arr[i]]++;
        }
        for(int i=500;i>=1;i--){
            if(A[i]==i){
                return i;
            }
        }
        return -1;
    }
}