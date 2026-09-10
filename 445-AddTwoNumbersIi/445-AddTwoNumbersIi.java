// Last updated: 9/10/2026, 9:58:14 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        ListNode p1=null;
        ListNode c1=l1;
        ListNode a1=null;
        while(c1!=null){
            a1=c1.next;
            c1.next=p1;
            p1=c1;
            c1=a1;
        }
        l1=p1;
        ListNode p2=null;
        ListNode c2=l2;
        ListNode a2=null;
        while(c2!=null){
            a2=c2.next;
            c2.next=p2;
            p2=c2;
            c2=a2;
        }
        l2=p2;
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        int carry=0,total;
        while(l1!=null || l2!=null || carry!=0){
            total=carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;
            }
            int n=total%10;
            carry=total/10;
            temp.next=new ListNode(n);
            temp=temp.next;
        }
        ListNode t1=ans.next;
        ListNode p3=null;
        ListNode c3=t1;
        ListNode a3=null;
        while(c3!=null){
            a3=c3.next;
            c3.next=p3;
            p3=c3;
            c3=a3;
        }
        t1=p3;
        return t1;
    }
}