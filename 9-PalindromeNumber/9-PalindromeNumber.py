# Last updated: 1/8/2026, 3:35:10 PM
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x<0:
            return False
        s=str(x)
        p=int(s[::-1])
        if x==p:
            return True
        else:
            return False
        