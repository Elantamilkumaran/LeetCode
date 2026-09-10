// Last updated: 9/10/2026, 10:00:51 AM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        comp(1,n,k,c,ans);
        return ans;
    }
    public static void comp(int i,int n,int k,List<Integer> c,List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int x=i;x<=n;x++){
            c.add(x);
            comp(x+1,n,k-1,c,ans);
            c.remove(c.size()-1);
        }
    }
}