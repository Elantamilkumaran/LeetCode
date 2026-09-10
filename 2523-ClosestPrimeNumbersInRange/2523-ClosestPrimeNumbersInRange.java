// Last updated: 9/10/2026, 9:49:15 AM
class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] p=new int [right+1];
        int n=p.length;
        for(int i=2;i<n;i++){
            p[i]=1;
        }
        for(int i=0;i*i<=n;i++){
            if(p[i]==1){
                for(int j=i*i;j<n;j+=i){
                    p[j]=0;
                }
            }
        }
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(p[i]==1){
                a1.add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        int a=-1;
        int b=-1;
        for(int i=0;i<a1.size()-1;i++){
            if(min>a1.get(i+1)-a1.get(i)){
                min=a1.get(i+1)-a1.get(i);
                a=a1.get(i);
                b=a1.get(i+1);
            }
        }
        int[] ans=new int[2];
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}