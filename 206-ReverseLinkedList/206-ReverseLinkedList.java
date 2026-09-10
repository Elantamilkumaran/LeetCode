// Last updated: 9/10/2026, 9:59:54 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        ListNode after=null;
        while(cur!=null){
            after=cur.next;
            cur.next=prev;
            prev=cur;
            cur=after;
        }
        head=prev;
        return head;
    }
}