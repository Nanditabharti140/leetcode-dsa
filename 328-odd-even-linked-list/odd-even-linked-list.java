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
    public ListNode oddEvenList(ListNode head) {
        ListNode t = head;
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-2);
        ListNode d1 = odd;
        ListNode d2 = even;
        while(t != null){
            d1.next = t;
            t = t.next;
            d1 = d1.next;
            d2.next = t;
            if(t != null) t = t.next;
            d2 = d2.next;
        }
        d1.next = even.next;
        return odd.next;
    }
}