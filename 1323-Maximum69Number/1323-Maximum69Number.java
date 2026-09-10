// Last updated: 9/10/2026, 9:54:16 AM
class Solution {
    public int maximum69Number (int num) {
        char[] a=String.valueOf(num).toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='6'){
                a[i]='9';
                break;
            }
        }
        return Integer.valueOf(new String(a));
    }
}