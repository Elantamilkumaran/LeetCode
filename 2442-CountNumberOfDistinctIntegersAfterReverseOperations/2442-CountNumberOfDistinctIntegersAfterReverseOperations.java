// Last updated: 9/10/2026, 9:49:45 AM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int rev,d;
        for(int num:nums){
            s.add(num);
            rev=0;
            while(num!=0){
                d=num%10;
                rev=(rev*10)+d;
                num/=10;
            }
            s.add(rev);
        }
        return s.size();
    }
}