// Last updated: 1/14/2026, 10:26:48 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int j=0;
        int[] ans=new int[friends.length];
        for(int i=0;i<order.length;i++){
            if(isContains(order[i],friends)){
                ans[j]=order[i];
                j++;
            }
        }
        return ans;
    }
    public boolean isContains(int t,int[] friends){
        for(int i=0;i<friends.length;i++){
            if(t==friends[i]) return true;
        }
        return false;
    }
}