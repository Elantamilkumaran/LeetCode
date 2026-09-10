// Last updated: 9/10/2026, 9:53:45 AM
class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double ans=0;
        for(int s:salary){
            if(min>s) min=s;
            if(max<s) max=s;
            ans+=s;
        }
        return (ans-min-max)/(salary.length-2);
    }
}