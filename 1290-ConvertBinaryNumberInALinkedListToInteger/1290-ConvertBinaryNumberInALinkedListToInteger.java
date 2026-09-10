// Last updated: 9/10/2026, 9:54:35 AM
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
    public int getDecimalValue(ListNode head) {
        ListNode temp= head;
        StringBuilder s = new StringBuilder();
        //String s = "";
        while(temp!=null){
            s.append(String.valueOf(temp.val));
            //s += String.valueOf(temp.val);
            temp=temp.next;
        }
        return Integer.parseInt(s.toString(),2);
    }
}