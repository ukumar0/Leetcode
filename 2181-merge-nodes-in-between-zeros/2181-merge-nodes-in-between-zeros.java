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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode l = temp, r = head.next;
        while (r != null) {
            int res = 0;
            while (r != null && r.val != 0) {
                res += r.val;
                r = r.next;
            }
            l.next = new ListNode(res);
            l = l.next;
            if (r != null) {
                r = r.next;
            }
        }
        return temp.next;
    }
}