# Last updated: 9/10/2026, 9:54:43 AM
class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        s=0
        m=1
        while(n):
            l=n%10
            s=s+l
            m=m*l
            n=n//10
        return m-s