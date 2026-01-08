# Last updated: 1/8/2026, 3:32:24 PM
import math
class Solution(object):
    def findGCD(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=min(nums)
        m=max(nums)
        while(l!=0):
            m,l=l,m%l
        return m