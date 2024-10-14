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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i =0, j =0, sum =0,r = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1!=null||l2!=null||r!=0){
            i=0;j=0;
            if(l1!=null){i = l1.val;l1 = l1.next;}
            if(l2!=null){j = l2.val;l2=l2.next;}
            sum = i + j + r;
            r = sum/10;
            int carry = sum%10;
            cur.next = new ListNode(carry);
            cur = cur.next;
        }
        return res.next;
    }
}