// Last updated: 9/10/2026, 9:59:04 AM
class NumArray {
    int[] ps;
    public NumArray(int[] nums) {
        ps=new int[nums.length+1];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ps[i+1]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return ps[right+1]-ps[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */