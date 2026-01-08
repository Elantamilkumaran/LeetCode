// Last updated: 1/8/2026, 3:32:13 PM
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