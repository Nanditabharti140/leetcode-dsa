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
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode f = null; 
        while(c != null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    public void reorderList(ListNode head) {
        ListNode head1 = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        while(t1 != null && t2 != null){
           d.next = t1;
           d = t1;
           t1 = t1.next;
           d.next = t2;
           d = t2;
           t2 = t2.next;
        }
        if(t1 == null) d.next = t2;
        else d.next = t1;
        head = dummy.next;
        
    }
}