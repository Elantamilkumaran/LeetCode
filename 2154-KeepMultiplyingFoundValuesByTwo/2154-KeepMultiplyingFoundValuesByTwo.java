// Last updated: 9/10/2026, 9:50:42 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            boolean con=false;
            for(int num:nums){
                if(num==original){
                    con=true;
                    break;
                }
            }
            if(con){
                original*=2;
            }else{
                return original;
            }
        }
    }
}