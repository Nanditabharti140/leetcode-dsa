class Solution {
    public void reverse(ListNode head){
        ListNode c = head;
        ListNode p = null;
        ListNode f = null;
        while(c !=  null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //first method
        // ArrayList<ListNode> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }
        // int i = left-1;
        // int j = right-1;
        // while(i < j){
        //     ListNode t1 = arr.get(i);
        //     ListNode t2 = arr.get(j);
        //     arr.set(i,t2);
        //     arr.set(j,t1);
        //     i++;
        //     j--;
        // }
        // for(i = 0; i < arr.size(); i++){
        //     // arr.get(i).next = (i == arr.size()-1) ? null : arr.get(i+1);
        //     if(i == arr.size()-1) arr.get(i).next = null; 
        //     else arr.get(i).next = arr.get(i+1);
        // }
        // return arr.get(0);


        //second method

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;

        for(int i = 1; i <= left-1; i++){
            temp = temp.next;
        }

        ListNode head2 = temp.next;
        ListNode tail1 = temp;

        temp = dummy;
        for(int i = 1; i <= right; i++){
            temp = temp.next;
        }
        
        ListNode head3 = temp.next;
        ListNode tail2 = temp;

        tail1.next = null;
        tail2.next = null;

        reverse(head2);

        //make connections after reversing
        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;
    }
}