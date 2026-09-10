// Last updated: 9/10/2026, 9:54:28 AM
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        StringBuilder temp=new StringBuilder();
        int ans=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            temp.append(s.charAt(i));
            if(temp.length()==k){
                int t=Integer.parseInt(temp.toString());

                if(t!=0 && num%t==0) ans++;
                temp.deleteCharAt(0);
            }
        }
        return ans;
    }
}