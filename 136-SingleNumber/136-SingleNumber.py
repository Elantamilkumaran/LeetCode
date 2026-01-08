# Last updated: 1/8/2026, 3:34:41 PM
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=set(nums)
        for i in s:
            c=nums.count(i)
            if c==1:
                return i
        