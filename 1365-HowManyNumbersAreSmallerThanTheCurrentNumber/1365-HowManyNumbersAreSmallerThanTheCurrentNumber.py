# Last updated: 9/10/2026, 9:54:13 AM
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