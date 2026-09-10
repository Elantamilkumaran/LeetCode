// Last updated: 9/10/2026, 9:49:37 AM
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int wl=queries[0].length();
        List<String> ans=new ArrayList<>();
        for(String q:queries){
            for(String d:dictionary){
                int c=0;
                for(int i=0;i<wl;i++){
                    if(q.charAt(i)!=d.charAt(i)){
                        c++;
                    }
                }
                if(c<=2){
                    ans.add(q);
                    break;
                }
            }
        }
        return ans;
    }
}