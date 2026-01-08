# Last updated: 1/8/2026, 3:34:47 PM
import math
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        x=math.sqrt(x)
        return int(abs(math.floor(x)))
        