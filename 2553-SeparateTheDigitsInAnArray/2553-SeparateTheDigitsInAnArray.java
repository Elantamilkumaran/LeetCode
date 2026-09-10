// Last updated: 9/10/2026, 9:49:04 AM
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int num:nums){
            String s=String.valueOf(num);
            for(char ch:s.toCharArray()){
                a.add(ch-'0');
            }
        }
        int[] answer=new int[a.size()];
        for(int i=0;i<a.size();i++){
            answer[i]=a.get(i);
        }
        return answer;
    }
}