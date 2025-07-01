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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp =  new ListNode(-1);
        ListNode t = temp;
        Set<Integer> s = new HashSet<>();
        for(int num : nums)
        {
            s.add(num);
        }

        while(head!=null)
        {
            if(!s.contains(head.val)){
                 t.next = head;
            t = t.next;
            }
                  head = head.next; 
        }

        t.next =  null;
    return temp.next;
    }
    
}