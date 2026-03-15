
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i =0; i<n; i++){
            fast = fast.next;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        if(fast == null) return slow.next;
        slow.next = slow.next.next;
        return head;

    }
}