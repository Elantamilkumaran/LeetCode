// Last updated: 1/8/2026, 3:33:37 PM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int num:asteroids){
            if(num>0){
                stack.push(num);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(num)) stack.pop();
                if(!stack.isEmpty() && stack.peek()==Math.abs(num)) stack.pop();
                else if(stack.isEmpty() || stack.peek()<0) stack.push(num);
            }
        }
        int[] ans=new int[stack.size()];
        int i=0;
        for(int num:stack){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}