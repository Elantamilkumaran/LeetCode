// Last updated: 9/10/2026, 9:55:23 AM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s="123456789";
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                a.add(Integer.valueOf(s.substring(i,j+1)));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:a){
            if(num>=low && num<=high){
                ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}