# Last updated: 1/8/2026, 3:31:21 PM
class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        for i in nums:
            if i%3!=0:
                c=c+1
        return c
        