# Last updated: 1/8/2026, 3:33:29 PM
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
        