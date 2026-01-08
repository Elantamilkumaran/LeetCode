# Last updated: 1/8/2026, 3:35:07 PM
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        res=0
        l=0
        res_set=set()
        for i in range(0,len(s)):
            while s[i] in res_set:
                res_set.remove(s[l])
                l+=1
            res_set.add(s[i])
            res=max(res,i-l+1)
        return(res)