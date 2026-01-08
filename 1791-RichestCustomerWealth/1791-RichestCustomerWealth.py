# Last updated: 1/8/2026, 3:32:48 PM
class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        m=0
        for i in accounts:
            s=sum(i)
            if s>m :
                m=s
        return m
        