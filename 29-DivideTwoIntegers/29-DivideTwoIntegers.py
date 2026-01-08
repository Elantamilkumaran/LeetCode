# Last updated: 1/8/2026, 3:34:58 PM
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        r=abs(dividend)//abs(divisor)
        r= r if (dividend<0 and divisor<0)or(dividend>0 and divisor>0) else -r
        if r<-2**31:
            return -2**31
        elif r>2**31-1:
            return 2**31-1
        else:
            return r
