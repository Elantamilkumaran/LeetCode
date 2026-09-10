// Last updated: 9/10/2026, 9:48:12 AM
class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        String v="aeiouAEIOU";
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(v.contains(s.charAt(i)+"")) a.add(s.charAt(i));
        }
        Collections.sort(a);
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(v.contains(s.charAt(i)+"")) sb.append(a.get(ind++));
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}