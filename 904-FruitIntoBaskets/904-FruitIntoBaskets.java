// Last updated: 9/10/2026, 9:56:09 AM
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int max=0;
        int l=0;
        for(int i=0;i<fruits.length;i++){
            int n=fruits[i];
            m.put(n,m.getOrDefault(n,0)+1);
            while(m.size()>2){
                if(m.get(fruits[l])>0){
                    m.put(fruits[l],m.get(fruits[l])-1);
                }
                if(m.get(fruits[l])==0){
                    m.remove(fruits[l]);
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}