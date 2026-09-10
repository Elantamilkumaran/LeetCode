# Last updated: 9/10/2026, 9:51:04 AM
class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        mc=0
        for s in sentences:
            l=s.split()
            c=len(l)
            if c>mc:
                mc=c
        return mc