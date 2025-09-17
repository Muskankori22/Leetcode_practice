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
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
        int temp = b;
        b = a%b;
        a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
      ListNode prev = head;
      ListNode anext =head.next;
      while(anext!=null)
      {
        int hcf = gcd(prev.val,anext.val);
        ListNode temp = new ListNode(hcf);
        prev.next = temp;
        temp.next = anext;
        anext = anext.next;
        prev = prev.next.next;
      }
      return head;
    }
}