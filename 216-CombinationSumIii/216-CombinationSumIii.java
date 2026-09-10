// Last updated: 9/10/2026, 9:59:40 AM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        int[] can={1,2,3,4,5,6,7,8,9};
        int l=can.length;
        Arrays.sort(can);
        comb(0,l,can,n,0,c,ans,k);
        return ans;
    }
    public static void comb(int i,int l,int[] can,int t,int sum,List<Integer> c,List<List<Integer>> ans,int k){
        if(sum==t && c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        if(sum>t || i==can.length) return;
        for(int x=i;x<l;x++){
            if(x>i && can[x]==can[x-1]) continue;
            c.add(can[x]);
            comb(x+1,l,can,t,sum+can[x],c,ans,k);
            c.remove(c.size()-1);
        }
    }
}