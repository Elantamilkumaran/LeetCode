# Last updated: 9/10/2026, 9:54:04 AM
class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        t=[]
        j=0
        for i in index:
            t.insert(i,nums[j])
            j=j+1
        return t
        