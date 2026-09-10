# Last updated: 9/10/2026, 9:53:03 AM
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
        