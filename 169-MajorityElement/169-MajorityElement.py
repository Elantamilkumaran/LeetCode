# Last updated: 1/8/2026, 3:34:28 PM
class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=set()
        n=len(nums)
        for i in nums:
            s.add(i)
        for i in s:
            c=nums.count(i)
            if c>(n/2):
                return i