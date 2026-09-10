// Last updated: 9/10/2026, 9:57:06 AM
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int n=left;n<=right;n++){
            int t=n;
            int temp=n;
            int flag=1;
            while(temp>0){
                int d=temp%10;
                if(d==0 || t%d!=0){
                    flag=0;
                    break;
                }
                temp/=10;
            }
            if(flag==1) a.add(t);
        }
        return a;
    }
}