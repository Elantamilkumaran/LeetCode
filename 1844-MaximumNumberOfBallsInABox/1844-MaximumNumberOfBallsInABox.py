# Last updated: 1/8/2026, 3:32:37 PM
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
