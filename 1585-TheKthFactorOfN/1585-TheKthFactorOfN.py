# Last updated: 1/8/2026, 3:32:57 PM
class Solution(object):
    def kthFactor(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        c=0
        for i in range(1,n+1):
            if n%i==0:
                c+=1
                if c==k:
                    return i
        return -1