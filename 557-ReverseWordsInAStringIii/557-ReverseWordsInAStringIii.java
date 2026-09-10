// Last updated: 9/10/2026, 9:57:44 AM
class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        for(int i=0;i<a.length;i++){
            char[] ch=a[i].toCharArray();
            for(int j=0,k=ch.length-1;j<k;j++,k--){
                char temp=ch[j];
                ch[j]=ch[k];
                ch[k]=temp;
            }
            a[i]=new String(ch);
        }
        return String.join(" ",a);
    }
}