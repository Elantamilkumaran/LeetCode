# Last updated: 1/8/2026, 3:33:24 PM
class Solution(object):
    def isBoomerang(self, points):
        """
        :type points: List[List[int]]
        :rtype: bool
        """
        (x1,y1),(x2,y2),(x3,y3)=points
        a=(0.5)*abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))
        if a!=0:
            return True
        else:
            return False