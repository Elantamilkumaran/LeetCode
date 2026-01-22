// Last updated: 1/22/2026, 12:25:36 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> m=new HashMap<>();
        for(int i=0;i<names.length;i++){
            m.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int left=0,right=heights.length-1;
        while(left<right){
            int temp=heights[left];
            heights[left]=heights[right];
            heights[right]=temp;
            left++;
            right--;
        }
        String[] ans=new String[names.length];
        int i=0;
        for(int key=0;key<heights.length;key++){
            ans[i]=m.get(heights[key]);
            i++;
        }
        return ans;
    }
}