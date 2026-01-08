// Last updated: 1/8/2026, 3:33:50 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans=new String[score.length];
        ArrayList<Integer> s=new ArrayList<>();
        for(int i:score){
            s.add(i);
        }
        Collections.sort(s);
        int n=s.size()-1;
        int j=0;
        for(int i=0;i<score.length;i++){
            if(score[i]==s.get(n)){
                ans[j]="Gold Medal";
                j++;
            }
            else if(score[i]==s.get(n-1)){
                ans[j]="Silver Medal";
                j++;
            }
            else if(score[i]==s.get(n-2)){
                ans[j]="Bronze Medal";
                j++;
            }
            else{
                int index=s.indexOf(score[i]);
                ans[j]=(s.size()-index)+"";
                j++;
            }
        }
        return ans;
    }    
}