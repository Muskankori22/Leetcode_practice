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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode curr = head;
       ListNode first = head;
       ListNode second = head;
       int size = 0;
       while(curr!=null)
       {
        size++;
        curr = curr.next;
       } 
       size -= k;
       for(int i=1;i<k;i++){
        first = first.next;
       }
       for(int i=0;i<size;i++)
       {
        second = second.next;
       }
       if(first==null || second == null) return head;
       int temp = first.val;
       first.val = second.val;
       second.val = temp;
       return head;
    }

}