# Last updated: 9/10/2026, 9:51:21 AM
class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        s=0
        m="--"
        p="++"
        for i in operations:
            if m in i:
                s=s-1
            elif p in i:
                s=s+1
        return s 

        