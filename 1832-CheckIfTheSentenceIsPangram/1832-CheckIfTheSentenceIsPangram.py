# Last updated: 9/10/2026, 9:52:08 AM
class Solution(object):
    def checkIfPangram(self, sentence):
        """
        :type sentence: str
        :rtype: bool
        """
        s=set()
        for i in sentence:
            s.add(i)
        if len(s)==26:
            return True
        else:
            return False
