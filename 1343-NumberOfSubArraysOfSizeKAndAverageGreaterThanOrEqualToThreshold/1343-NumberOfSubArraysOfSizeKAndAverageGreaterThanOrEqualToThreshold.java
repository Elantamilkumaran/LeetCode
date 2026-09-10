// Last updated: 9/10/2026, 9:54:20 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int avg=0;
        for(int i=0;i<k;i++){
            avg+=arr[i];
        }
        if(threshold<=avg/k) count++;
        int l=0,r=k;
        while(r<arr.length){
            avg-=arr[l++];
            avg+=arr[r++];
            if(threshold<=avg/k) count++;
        }
        return count;
    }
}