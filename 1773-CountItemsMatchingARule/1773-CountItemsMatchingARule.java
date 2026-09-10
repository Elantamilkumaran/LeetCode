// Last updated: 9/10/2026, 9:52:28 AM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind=-1;
        int count=0;
        if(ruleKey.equals("type")) ind=0;
        else if(ruleKey.equals("color")) ind=1;
        else ind=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(ind).equals(ruleValue)) count++;
        }
        return count;
    }
}