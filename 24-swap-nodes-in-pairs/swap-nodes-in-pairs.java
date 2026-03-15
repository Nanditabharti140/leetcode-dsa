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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-2);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;
        while(t != null){
            t1.next = t;
            t1 = t;
            t = t.next;

            t2.next = t;
            if(t != null){
                t2 = t;
                t = t.next;
            }
        }
        if(t1.next == null) t2.next = null;
        else t1.next = null;
        ListNode i = odd.next;
        ListNode j = even.next;
        ListNode dummy = new ListNode(-3);
        ListNode k = dummy;
        while(i != null && j != null){
            k.next = j;
            k = j;
            j = j.next;
            k.next = i;
            k = i;
            i = i.next;
        }
        if(i == null) k.next = j;
        else k.next = i;
        return even.next;

    }
}