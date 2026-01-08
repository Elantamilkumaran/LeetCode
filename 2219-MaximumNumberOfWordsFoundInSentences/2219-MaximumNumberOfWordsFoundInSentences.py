# Last updated: 1/8/2026, 3:32:17 PM
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