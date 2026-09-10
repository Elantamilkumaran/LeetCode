# Last updated: 9/10/2026, 9:46:34 AM
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
        