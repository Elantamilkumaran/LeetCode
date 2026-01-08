# Last updated: 1/8/2026, 3:34:24 PM
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d={}
        dd={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=t[i]
            if t[i] not in dd:
                dd[t[i]]=s[i]
            if s[i] in d:
                if t[i]!=d[s[i]]:
                    return False
            if t[i] in dd:
                if s[i]!=dd[t[i]]:
                    return False
        print(d)
        print(dd)
        return True

        