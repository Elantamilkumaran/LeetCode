# Last updated: 1/8/2026, 3:31:45 PM
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