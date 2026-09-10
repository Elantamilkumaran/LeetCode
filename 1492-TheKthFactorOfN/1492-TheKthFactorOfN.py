# Last updated: 9/10/2026, 9:53:39 AM
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