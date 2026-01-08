# Last updated: 1/8/2026, 3:34:02 PM
class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        l=[]
        for i in s:
            if i in ['a','e','i','o','u','A','E','I','O','U']:
                l.append(i)
        new=""
        for i in range(len(s)):
            if s[i] in ['a','e','i','o','u','A','E','I','O','U']:
                new=new+l.pop()
            else:
                new=new+s[i]  
        return new 