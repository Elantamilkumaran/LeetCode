# Last updated: 9/10/2026, 9:46:57 AM
class Solution(object):
    def isValid(self, word):
        """
        :type word: str
        :rtype: bool
        """
        c="abcdefghijklmnopqrstuvwxyz"
        v="aeiouAEIOU"
        l=[False,False,False]
        if len(word)>=3:
            l[0]=True
            for i in word:
                if not i.isalnum():
                    return False
                elif i in v:
                    l[1]=True
                elif i.lower() in c:
                    l[2]=True
        return all(l)