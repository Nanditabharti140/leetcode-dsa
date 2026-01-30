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
    public ListNode removeElements(ListNode head, int val) {
        ListNode i = head;
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        if(head == null) return head;
        while(i != null){
            if(i.val != val){
                d.next = i;
                d = i;
                i = i.next;
            }
            else{
                i = i.next;
            }
        }
        d.next = i;

        return dummy.next;
    }
}