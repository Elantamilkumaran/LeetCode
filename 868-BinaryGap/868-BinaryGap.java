// Last updated: 9/10/2026, 9:56:25 AM
class Solution {
    public int binaryGap(int n) {
        int flag=0;
        int count=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(n>0){
            int d=n%2;
            n/=2;
            if(d==1){
                if(flag==1){
                    a.add(count);
                }
                flag=1;
                count=0;
            }
            else{
                if(flag==1) count++;
            }
        }
        if(a.isEmpty()) return 0;
        return Collections.max(a)+1;
    }
}