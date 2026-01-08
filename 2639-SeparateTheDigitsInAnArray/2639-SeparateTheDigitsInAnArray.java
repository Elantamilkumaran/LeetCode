// Last updated: 1/8/2026, 3:31:53 PM
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