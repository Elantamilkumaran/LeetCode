// Last updated: 1/8/2026, 3:32:19 PM
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