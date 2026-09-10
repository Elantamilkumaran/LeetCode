# Last updated: 9/10/2026, 9:49:57 AM
class Solution(object):
    def smallestEvenMultiple(self, n):
        """
        :type n: int
        :rtype: int
        """
        l=0
        i=1
        while(True):
            if i%2==0 and i%n==0:
                l=i
                break
            i=i+1
        return l
        