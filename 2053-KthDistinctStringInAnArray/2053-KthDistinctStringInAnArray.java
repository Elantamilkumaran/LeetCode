// Last updated: 9/10/2026, 9:51:11 AM
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> m=new HashMap<>();
        for(String s:arr){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        int i=0;
        for(String s:arr){
            if(m.get(s)==1){
                i++;
                if(i==k){
                    return s;
                }
            }
        }
        return "";
    }
}