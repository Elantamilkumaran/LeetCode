// Last updated: 9/10/2026, 9:47:19 AM
class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int count=1;
        int sum=0;
        for(int i=freq.length-1;i>=0;i--){
            if(count<=8){
                sum+=(1*freq[i]);
            }
            else if(count<=16){
                sum+=(2*freq[i]);
            }
            else if(count<=24){
                sum+=(3*freq[i]);
            }
            else{
                sum+=(4*freq[i]);
            }
            count++;
        }
        return sum;
    }    
}