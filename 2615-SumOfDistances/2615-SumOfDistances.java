// Last updated: 9/10/2026, 9:48:54 AM
class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for(List<Integer> list : map.values()){

            int m = list.size();
            long[] prefix = new long[m];
            prefix[0] = list.get(0);

            for(int i=1;i<m;i++){
                prefix[i] = prefix[i-1] + list.get(i);
            }

            for(int i=0;i<m;i++){

                long left = (long)list.get(i)*i - (i==0?0:prefix[i-1]);

                long right = (prefix[m-1]-prefix[i]) - (long)list.get(i)*(m-i-1);

                ans[list.get(i)] = left + right;
            }
        }

        return ans;
    }
}