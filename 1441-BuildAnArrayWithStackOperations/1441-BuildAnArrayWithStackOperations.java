// Last updated: 9/10/2026, 9:54:00 AM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> a=new ArrayList<>();
        int idx=0;
        for(int i=1;i<=n;i++){
            if(idx==target.length){
                break;
            }
            if(target[idx]==i){
                a.add("Push");
                idx++;
            }
            else{
                a.add("Push");
                a.add("Pop");
            }
        }
        return a;
    }
}