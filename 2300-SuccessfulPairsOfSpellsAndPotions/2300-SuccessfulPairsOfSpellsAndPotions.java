// Last updated: 9/10/2026, 9:50:24 AM
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