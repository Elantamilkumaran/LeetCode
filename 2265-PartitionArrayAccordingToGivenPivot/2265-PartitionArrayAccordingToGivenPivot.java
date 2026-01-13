// Last updated: 1/13/2026, 10:30:19 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> low=new ArrayList<>();
        ArrayList<Integer> high=new ArrayList<>();
        int n=nums.length;
        int pc=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) low.add(nums[i]);
            else if(nums[i]>pivot) high.add(nums[i]);
            else pc++;
        }
        int[] ans=new int[low.size()+high.size()+pc];
        for(int i=0;i<low.size();i++){
            ans[i]=low.get(i);
        }
        for(int i=0;i<pc;i++){
            ans[low.size()+i]=pivot;
        }
        for(int i=0;i<high.size();i++){
            ans[low.size()+pc+i]=high.get(i);
        }
        return ans;
    }
}