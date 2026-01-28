
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode fwd = null;
       ListNode curr = head;
       while(curr != null){
        fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
       } 
       return prev;
    }
}