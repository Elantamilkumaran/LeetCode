// Last updated: 9/10/2026, 9:48:21 AM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> a=new ArrayList<>();
        for(String word: words){
            String[] s=word.split("\\Q"+separator+"\\E");
            for(String i:s){
                if(!i.isEmpty()) a.add(i);
            }
        }
        return a;
    }
}