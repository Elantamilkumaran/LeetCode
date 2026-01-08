// Last updated: 1/8/2026, 3:33:02 PM
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