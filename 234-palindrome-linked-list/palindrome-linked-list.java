

class Solution {
    static ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode p = null;
        ListNode f = null;
        ListNode c = head;
        while(c != null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    
    public boolean isPalindrome(ListNode head) {
    //METHOD 1 USING EXTRA SPACE
    //    ListNode temp = head;
    //    ArrayList<Integer> arr = new ArrayList<>();
    //    while(temp != null){
    //     arr.add(temp.val);
    //     temp = temp.next;
    //    } 
    //    int i = 0, j = arr.size() - 1;
    //    while(i < j){
    //     int a = arr.get(i), b = arr.get(j);
    //     if(a != b) return false;
    //     i++; j--;
    //    }
    //    return true;
    if(head == null || head.next == null) return true;
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode head2 = slow;
    head2 = reverse(head2);
    ListNode a = head;
    ListNode b = head2;
    if(head2 == null){
        if(a.val != a.next.val)return false;
        return true;
    }
    while( b != null ){
        if(a.val != b.val) return false;
        a = a.next;
        b = b.next;
    }
    return true;
    }
}