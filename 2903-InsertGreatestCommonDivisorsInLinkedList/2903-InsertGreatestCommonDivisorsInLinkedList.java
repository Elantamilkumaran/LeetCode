// Last updated: 1/14/2026, 10:27:12 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode current=head;
        while(current!=null && current.next!=null){
            ListNode newNode=new ListNode(gcd(current.val,current.next.val));
            newNode.next=current.next;
            current.next=newNode;
            current=newNode.next;
        }
        return head;
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}