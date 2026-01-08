// Last updated: 1/8/2026, 3:31:26 PM
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