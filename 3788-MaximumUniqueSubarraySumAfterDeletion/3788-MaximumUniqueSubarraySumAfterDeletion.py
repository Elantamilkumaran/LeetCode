# Last updated: 1/8/2026, 3:31:16 PM
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
        