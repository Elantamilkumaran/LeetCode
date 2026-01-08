# Last updated: 1/8/2026, 3:35:11 PM
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l=[]
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if((nums[i]+nums[j])==target):
                    l.append(i)
                    l.append(j)
        return l