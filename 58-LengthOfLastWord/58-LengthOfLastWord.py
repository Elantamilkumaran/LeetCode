# Last updated: 1/8/2026, 3:34:49 PM
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        l=s.split()
        for i in range(0,len(l)):
            if (i==(len(l)-1)):
                return len(l[i])