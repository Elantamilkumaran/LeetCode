# Last updated: 1/8/2026, 3:33:05 PM
class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in nums:
            c=0
            for j in nums:
                if i>j:
                    c+=1
            l.append(c)
        return(l)