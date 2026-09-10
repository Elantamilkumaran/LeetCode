// Last updated: 9/10/2026, 9:43:53 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(n!=0){
                int d=n%10;
                if(max<d) max=d;
                if(min>d) min=d;
                n/=10;
            }
            a[i]=max-min;
        }
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max==a[i]){
                sum+=nums[i];
            }
        }
        return sum;
    }
}