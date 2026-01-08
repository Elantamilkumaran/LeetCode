# Last updated: 1/8/2026, 3:31:44 PM
class Solution(object):
    def countPairs(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        l=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if(nums[i]+nums[j])<target:
                    l.append((nums[i],nums[j]))
        return len(l)