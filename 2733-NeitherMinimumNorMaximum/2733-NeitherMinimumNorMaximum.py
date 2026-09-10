# Last updated: 9/10/2026, 9:48:37 AM
class Solution(object):
    def findNonMinOrMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        if len(nums)>=3:
            return nums[1]
        if len(nums)<=2:
            return -1