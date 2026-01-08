# Last updated: 1/8/2026, 3:34:52 PM
class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=set(nums)
        n=len(nums)
        for i in range(1,n+2):
            if i not in s:
                return i