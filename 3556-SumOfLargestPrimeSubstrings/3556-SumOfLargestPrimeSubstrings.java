// Last updated: 9/10/2026, 9:45:48 AM
class Solution {
    public long sumOfLargestPrimes(String s) {
        TreeSet<Long> se=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                long sub=Long.parseLong(s.substring(i,j+1));
                if(isPrime(sub)){
                    se.add(sub);
                }
            }
        }
        List<Long> l = new ArrayList<>(se);
        int si=l.size();
        if(si==0) return 0;
        long sum=0;
        if(si<3){
            for(int i=0;i<si;i++) sum+=l.get(i);
        }
        else{
            for(int i=si-3;i<si;i++) sum+=l.get(i);
        }
        return sum;
    }
    public boolean isPrime(long sub){
        if(sub<2) return false;
        for(int i=2;i<=Math.sqrt(sub);i++){
            if(sub%i==0) return false;
        }
        return true;
    }
}