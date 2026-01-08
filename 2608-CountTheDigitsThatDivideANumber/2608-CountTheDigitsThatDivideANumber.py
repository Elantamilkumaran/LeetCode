# Last updated: 1/8/2026, 3:31:58 PM
class Solution(object):
    def countDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        t=num
        c=0
        while(num):
            if(t%(num%10)==0):
                c+=1
            num//=10
        return c