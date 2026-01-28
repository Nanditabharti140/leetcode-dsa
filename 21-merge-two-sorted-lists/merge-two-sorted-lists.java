
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode i = head1;
        ListNode j = head2;
        ListNode d = new ListNode(-1);
        ListNode k = d;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i == null) k.next = j;
        else k.next = i;
        return d.next;
    }
}