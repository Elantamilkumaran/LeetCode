# Last updated: 9/10/2026, 9:53:35 AM
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
        