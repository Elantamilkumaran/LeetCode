# Last updated: 9/10/2026, 9:54:32 AM
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
        