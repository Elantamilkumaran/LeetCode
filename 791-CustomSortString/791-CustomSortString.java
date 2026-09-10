// Last updated: 9/10/2026, 9:56:39 AM
class Solution {
    public String customSortString(String order, String s) {
        HashMap<String,Integer> m=new HashMap<>();
        for(char ss: s.toCharArray()){
            m.put(ss+"",m.getOrDefault(ss+"",0)+1);
        }
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<order.length();i++){
            char ch=order.charAt(i);
            if (m.containsKey(ch + "")) {
                int count = m.get(ch + "");
                for (int j = 0; j < count; j++) {
                    s1.append(ch);
                }
                m.put(ch + "", 0);
            }

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(m.containsKey(ch+"") && m.get(ch+"")>0){
                s1.append(ch);
                m.put(ch+"",m.get(ch+"")-1);
            }
        }
        return s1.toString();
    }
}