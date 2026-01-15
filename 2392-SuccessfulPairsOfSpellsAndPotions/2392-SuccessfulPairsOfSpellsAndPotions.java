// Last updated: 1/15/2026, 10:53:27 AM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int spell=spells[i];
            int low=0;
            int high=potions.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long) potions[mid]*spell>=success){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            ans[i]=potions.length-low;
        }
        return ans;
    }
}