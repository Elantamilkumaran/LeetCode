# Last updated: 1/8/2026, 3:32:23 PM
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
