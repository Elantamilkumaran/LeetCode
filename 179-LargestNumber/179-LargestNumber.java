// Last updated: 9/10/2026, 10:00:08 AM
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr =new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b) -> {
            return (b+a).compareTo(a+b);
        });
        StringBuilder sb=new StringBuilder();
        
        for(String n:arr){
            sb.append(n);
        }
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}