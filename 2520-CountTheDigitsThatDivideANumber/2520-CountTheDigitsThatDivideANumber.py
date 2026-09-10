# Last updated: 9/10/2026, 9:49:23 AM
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