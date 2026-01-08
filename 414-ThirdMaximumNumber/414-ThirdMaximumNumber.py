# Last updated: 1/8/2026, 3:33:56 PM
class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=list(set(nums))
        l.sort(reverse=True)
        if len(l)<3:
            return l[0]
        else:
            return l[2]       