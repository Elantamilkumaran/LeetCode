// Last updated: 9/10/2026, 9:49:59 AM
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int total_min=0;
        int[] pS=new int[travel.length+1];
        pS[0]=0;
        int sum=0;
        for(int i=1;i<pS.length;i++){
            sum+=travel[i-1];
            pS[i]=sum;
        }
        int ig=0,ip=0,im=0;
        int cg=0,cp=0,cm=0;
        for(int i=0;i<garbage.length;i++){
            for(char ch:garbage[i].toCharArray()){
                if(ch=='G'){
                    cg++;
                    ig=i;
                }
                else if(ch=='P'){
                    cp++;
                    ip=i;
                }
                else if(ch=='M'){
                    cm++;
                    im=i;
                }
            }
        }
        total_min=cg+cp+cm+pS[ig]+pS[ip]+pS[im];
        return total_min;
        
    }
}