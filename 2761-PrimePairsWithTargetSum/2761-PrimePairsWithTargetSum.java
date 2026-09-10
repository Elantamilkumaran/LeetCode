// Last updated: 9/10/2026, 9:48:22 AM
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> a=new ArrayList<>();
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                for(int j=i+i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int x=2;x<=n/2;x++){
            if(prime[x] && prime[n-x]){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(x);
                temp.add(n-x);
                a.add(temp);
            }
        }
        return a;
    }
}