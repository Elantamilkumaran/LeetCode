// Last updated: 9/10/2026, 9:50:53 AM
class Solution {
    public int minimumSum(int num) {
        int[] a=new int[4];
        for(int i=0;i<4;i++){
            a[i]=num%10;
            num/=10;
        }
        Arrays.sort(a);
        int new1=a[0]*10;
        int new2=a[1]*10;
        new1+=a[2];
        new2+=a[3];
        return new1+new2;
    }
}