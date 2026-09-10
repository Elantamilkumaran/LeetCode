// Last updated: 9/10/2026, 9:51:47 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        ArrayList<String> a=new ArrayList<>();
        int size=part.length();
        for(char ch:s.toCharArray()){
            a.add(ch+"");
        }
        while(s.contains(part)){
            int ind=s.indexOf(part);
            for(int i=0;i<size;i++){
                a.remove(ind);
            }
            s=String.join("",a);
        }
        return s;
    }
}