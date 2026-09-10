# Last updated: 9/10/2026, 9:56:46 AM
class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        c=0
        for i in jewels:
            if i in stones:
                c+=stones.count(i)
        return c       