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
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode l1 = less;
        ListNode r1 = right;
        while(head!=null)
        {
            if(head.val < x)
            {
                l1.next = head;
                l1 = l1.next;
            }
            else{
                r1.next = head;
                r1 = r1.next;
            }
            head = head.next;
        }
        l1.next = right.next;
        r1.next = null;
        return less.next;
    }
}