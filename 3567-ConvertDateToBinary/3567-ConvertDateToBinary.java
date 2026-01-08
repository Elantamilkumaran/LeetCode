// Last updated: 1/8/2026, 3:31:20 PM
class Solution {
    public String convertDateToBinary(String date) {
        String y=Integer.toBinaryString(Integer.valueOf(date.substring(0,4)));
        String m=Integer.toBinaryString(Integer.valueOf(date.substring(5,7)));
        String d=Integer.toBinaryString(Integer.valueOf(date.substring(8,10)));
        StringBuilder s=new StringBuilder();
        s.append(y);
        s.append("-");
        s.append(m);
        s.append("-");
        s.append(d);
        return s.toString();
    }
}