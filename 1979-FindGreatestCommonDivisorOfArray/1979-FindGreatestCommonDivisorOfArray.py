# Last updated: 9/10/2026, 9:51:34 AM
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