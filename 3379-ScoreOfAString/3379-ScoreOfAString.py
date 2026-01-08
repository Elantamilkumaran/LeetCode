# Last updated: 1/8/2026, 3:31:32 PM
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

        