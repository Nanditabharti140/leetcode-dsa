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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        if(c == null) return ans;  //2 size ki ll
        int idx = 1, firstidx = -1, lastidx = -1, mindist = Integer.MAX_VALUE;
        while(c != null){
            if((b.val > a.val && b.val > c.val)  || (b.val < a.val && b.val < c.val)){
                if(firstidx == -1) firstidx = idx;
                if(lastidx != -1){
                    int dist = idx - lastidx;
                    mindist = Math.min(dist,mindist);
                }
                lastidx = idx;
            }
            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxdist = lastidx - firstidx;
        if(maxdist == 0) maxdist = -1;
        if(mindist == Integer.MAX_VALUE) mindist = -1;
        ans[0] = mindist;
        ans[1] = maxdist;
        return ans;
    }
}