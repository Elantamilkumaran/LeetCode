# Last updated: 9/10/2026, 9:49:46 AM
class Solution(object):
    def commonFactors(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        c=0
        t=min(a,b)
        for i in range (1,t+1):
            if(a%i==0 and b%i==0):
                c=c+1
        return c
        