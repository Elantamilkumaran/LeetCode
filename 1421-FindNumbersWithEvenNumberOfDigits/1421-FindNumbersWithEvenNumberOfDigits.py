# Last updated: 1/8/2026, 3:33:08 PM
class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        for i in nums:
            if len(str(i))%2==0:
                c+=1
        return c
        