// Last updated: 9/10/2026, 9:50:57 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            a.add(temp.val);
            temp=temp.next;
        }
        int max=0;
        int n=a.size();
        for(int i=0;i<n/2;i++){
            if((a.get(i)+a.get(n-i-1))>max) max=a.get(i)+a.get(n-i-1);
        }
        return max;
    }
}