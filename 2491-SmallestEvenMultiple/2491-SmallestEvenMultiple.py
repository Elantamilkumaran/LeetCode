# Last updated: 1/8/2026, 3:32:06 PM
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
        