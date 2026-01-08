// Last updated: 1/8/2026, 3:34:10 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        int n=nums.length;
        //find firs zeroth element index store it in j
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        //if no zero's present
        if(j==-1) return;
        //swap zeroth element with non zero element
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}