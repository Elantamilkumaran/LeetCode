# Last updated: 1/8/2026, 3:33:03 PM
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
        