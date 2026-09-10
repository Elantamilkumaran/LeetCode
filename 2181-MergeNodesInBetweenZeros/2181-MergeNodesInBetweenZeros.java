// Last updated: 9/10/2026, 9:50:31 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(temp!=null){
            if(temp.val==0){
                temp=temp.next;
                int sum=0;
                while(temp!=null && temp.val!=0){
                    sum+=temp.val;
                    temp=temp.next;
                }
                if(sum>0){
                curr.next=new ListNode(sum);
                curr=curr.next;
                }
            }
        }
        return dummy.next;
    }
}