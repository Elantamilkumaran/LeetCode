# Last updated: 9/10/2026, 9:53:47 AM
class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        l1=[]
        final=[]
        for i in range(n):
            l1.append(nums[i])
        for i in range(n):
            nums.remove(nums[0])
        for i in range(n):
            final.append(l1[i])
            final.append(nums[i])
        return final