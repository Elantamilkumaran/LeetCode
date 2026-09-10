# Last updated: 9/10/2026, 9:45:36 AM
class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        v={}
        c={}
        vs="aeiou"
        for i in s:
            if i in vs:
                v[i]=s.count(i)
            else:
                c[i]=s.count(i)
        av=0
        for ch,k in v.items():
            if k>av:
                av=k
        ac=0
        for ch,k in c.items():
            if k>ac:
                ac=k
        return av+ac