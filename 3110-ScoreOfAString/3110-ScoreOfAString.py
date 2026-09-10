# Last updated: 9/10/2026, 9:47:08 AM
class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum=0
        for i in range(len(s)-1):
            sum=sum+(abs(ord(s[i])-ord(s[i+1])))
        return sum

        