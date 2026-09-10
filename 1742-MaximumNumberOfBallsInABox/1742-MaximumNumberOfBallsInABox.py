# Last updated: 9/10/2026, 9:52:36 AM
class Solution(object):
    def countBalls(self, lowLimit, highLimit):
        """
        :type lowLimit: int
        :type highLimit: int
        :rtype: int
        """
        dic={}
        for n in range(lowLimit,highLimit+1):
            sum=0
            while(n):
                d=n%10
                sum+=d
                n//=10
            if sum not in dic.keys():
                j=0
            else:
                j=dic[sum]
            dic[sum]=j+1
        return max(dic.values())
