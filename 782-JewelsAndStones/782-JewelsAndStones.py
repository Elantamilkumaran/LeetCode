# Last updated: 1/8/2026, 3:33:31 PM
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