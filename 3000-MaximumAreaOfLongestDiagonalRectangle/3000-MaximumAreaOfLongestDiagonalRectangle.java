// Last updated: 9/10/2026, 9:47:23 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int md=0;
        int ma=0;
        int n=dimensions.length;
        for(int i=0;i<n;i++){
            int first=dimensions[i][0];
            int back=dimensions[i][1];
            int cd=first*first+back*back;
            int ca=first*back;
            if(cd>md||(cd==md&&ca>ma)){
                md=cd;
                ma=ca;
            }
        }
        return ma;
    }
}