// Last updated: 9/10/2026, 9:49:22 AM
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        long sum=0;
        int left=0;
        int right=n-1;
        long check=skill[left]+skill[right];
        while(left<right){
            if(check==skill[left]+skill[right]){
                sum+=skill[left]*skill[right];
                left++;
                right--;
            }
            else{
                return -1;
            }
        }
        return sum;
    }
}