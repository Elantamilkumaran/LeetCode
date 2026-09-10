// Last updated: 9/10/2026, 9:59:27 AM
class Solution {
    class Pair{
        int val;
        int ind;
        Pair(int a,int b){
            val=a;
            ind=b;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.val-a.val);
        int l=0;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
            if(i-l+1>k){
                l++;
            }
            if(i-l+1==k){
                while(!pq.isEmpty()){
                    Pair cur=pq.peek();
                    if(cur.ind>=l){
                        ans[ind++]=cur.val;
                        break;
                    }
                    else{
                        pq.poll();
                    }
                }
            }
        }
        return ans;
    }
}