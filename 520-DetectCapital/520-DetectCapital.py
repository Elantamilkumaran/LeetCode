# Last updated: 1/8/2026, 3:33:48 PM
class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if(word.isupper() or word.istitle() or word.islower()):
            return True
        return False
        