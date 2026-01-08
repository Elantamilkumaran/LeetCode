# Last updated: 1/8/2026, 3:32:55 PM
class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if (nums[i]==nums[j]):
                    l.append((i,j))
        return len(l)
        