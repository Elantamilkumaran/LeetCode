// Last updated: 9/10/2026, 9:56:32 AM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> key=new Stack<>();
        key.push(0);
        Set<Integer> visited=new HashSet<>();
        while(!key.isEmpty()){
            int k=key.pop();
            if(!visited.contains(k)){
                visited.add(k);
                for(int t:rooms.get(k)){
                    key.push(t);
                }
            }
        }
        if(rooms.size()==visited.size()) return true;
        return false;
    }
}