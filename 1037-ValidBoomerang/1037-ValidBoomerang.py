# Last updated: 9/10/2026, 9:55:39 AM
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