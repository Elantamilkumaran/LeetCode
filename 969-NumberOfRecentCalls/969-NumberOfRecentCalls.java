// Last updated: 1/8/2026, 3:33:26 PM
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */