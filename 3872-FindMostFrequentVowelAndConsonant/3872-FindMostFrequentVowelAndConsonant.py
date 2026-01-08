# Last updated: 1/8/2026, 3:31:09 PM
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