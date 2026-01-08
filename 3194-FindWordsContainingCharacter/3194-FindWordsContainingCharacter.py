# Last updated: 1/8/2026, 3:31:35 PM
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        l=[]
        for i in range(len(words)):
            if x in words[i]:
                l.append(i)
        return l


        