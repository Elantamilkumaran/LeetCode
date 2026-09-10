// Last updated: 9/10/2026, 9:57:01 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int idx=s.pop();
                ans[idx]=i-idx;
            }
            s.push(i);
        }
        return ans;
    }
}