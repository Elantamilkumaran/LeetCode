// Last updated: 9/10/2026, 9:56:47 AM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a']=i;
        }
        ArrayList<Integer> a=new ArrayList<>();
        int ind=0;
        while(ind!=s.length()){
            int start=ind;
            int end=lastIndex[s.charAt(ind)-'a']+1;
            ind=hasAbove(s,start,end,lastIndex);
            int ans=ind-start;
            a.add(ans);
        }
        return a;
    }
    public static int hasAbove(String s,int start,int end,int[] lastIndex){
        int i=start;
        while(i<end){
            char ch=s.charAt(i);
            if(lastIndex[ch-'a']>=end){
                end=lastIndex[ch-'a']+1;
            }
            i++;
        }
        return end;
    }
}