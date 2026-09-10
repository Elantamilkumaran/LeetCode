// Last updated: 9/10/2026, 9:59:34 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a =new ArrayList<>();
        int res1=0;
        int res2=0;
        int c1=0;
        int c2=0;
        int t=nums.length/3;
        for(int num:nums){
            if(num==res1) c1++;
            else if(num==res2) c2++;
            else if(c1==0){
                res1=num;
                c1=1;
            }
            else if(c2==0){
                res2=num;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==res1) c1++;
            else if(num==res2) c2++;
        }
        if(c1>t) a.add(res1);
        if(c2>t) a.add(res2);
        return a;
    }
}