# Last updated: 9/10/2026, 9:51:25 AM
class Solution(object):
    def reversePrefix(self, word, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        i=word.find(ch)
        s1=word[:i+1]
        s1=s1[::-1]
        s2=word[i+1:]
        s3=s1+s2
        return s3
