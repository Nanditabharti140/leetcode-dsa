
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int len1=0, len2=0;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null){
            len1++;
            temp1 = temp1.next;
        }
          while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        if(len1 > len2){
            for(int i = 0; i< len1 - len2; i++){
                temp1 = temp1.next;
            }
        }
        temp2 = head2;
        if(len2 > len1){
            for(int i = 0; i< len2 - len1; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}