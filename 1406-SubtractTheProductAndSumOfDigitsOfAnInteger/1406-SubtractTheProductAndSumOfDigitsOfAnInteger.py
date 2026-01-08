# Last updated: 1/8/2026, 3:33:12 PM
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