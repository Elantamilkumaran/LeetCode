// Last updated: 9/10/2026, 9:56:33 AM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> s=new HashSet<>();
        ArrayList<String> a = new ArrayList<>(Arrays.asList(
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
        "...","-","..-","...-",".--","-..-","-.--","--.."
        ));
        for(int i=0;i<words.length;i++){
            StringBuilder sb =new StringBuilder();
            for(char ch:words[i].toCharArray()){
                sb.append(a.get(ch-'a'));
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}