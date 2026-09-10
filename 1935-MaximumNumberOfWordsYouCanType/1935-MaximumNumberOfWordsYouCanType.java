// Last updated: 9/10/2026, 9:55:11 AM
class Solution {
    public int canBeTypedWords(String text, String b) {
        String[] a=text.split(" ");
        HashSet<Character> hs=new HashSet<>();
        int count=0;
        for(char ch:b.toCharArray()){
            hs.add(ch);
        }
        for(String s:a){
            int flag=1;
            for(char ch:s.toCharArray()){
                if(hs.contains(ch)){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                count++;
            }
        }
        return count;
    }
}