// Last updated: 1/8/2026, 3:33:11 PM
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