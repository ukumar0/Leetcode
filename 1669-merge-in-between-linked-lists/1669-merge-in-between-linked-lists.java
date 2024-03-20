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
    public ListNode mergeInBetween(ListNode ls1, int a, int b, ListNode ls2) {
        ListNode left = ls1;
        for (int i = 1; i < a; i++)
            left = left.next;
        
        ListNode middle = left;
        for (int i = a; i <= b; i++)
            middle = middle.next;
        
		left.next = ls2;
        while (ls2.next != null)
            ls2 = ls2.next;
        
        ls2.next = middle.next;
        return ls1;
    }
}