# Last updated: 1/8/2026, 3:31:59 PM
class Solution(object):
    def convertTemperature(self, celsius):
        """
        :type celsius: float
        :rtype: List[float]
        """
        k=celsius+273.15
        f=celsius*1.80+32.00
        l=[k,f]
        return l
        