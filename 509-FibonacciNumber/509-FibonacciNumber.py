# Last updated: 9/10/2026, 9:55:56 AM
class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=0
        b=1
        for i in range(n+1):
            res=a
            t=a+b
            a=b
            b=t
        return res
        