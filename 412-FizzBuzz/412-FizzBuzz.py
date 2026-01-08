# Last updated: 1/8/2026, 3:33:57 PM
class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        l=[]
        s1="Fizz"
        s2="Buzz"
        for i in range(1,n+1):
            if i%3==0 and i%5==0:
                l.append(s1+s2)
            elif i%3==0:
                l.append(s1)
            elif i%5==0:
                l.append(s2)
            else:
                l.append(str(i))
        return l