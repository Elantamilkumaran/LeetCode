# Last updated: 9/10/2026, 9:46:00 AM
class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=[i for i in nums if i>0]
        if len(l)==0:
            return max(nums)
        else:
            return sum(set(l))
        