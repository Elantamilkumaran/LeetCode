# Last updated: 1/8/2026, 3:34:12 PM
class Solution(object):
    def missingNumber(self, nums):
       n=len(nums)
       return sum(range(0,n+1))-sum(nums)
        