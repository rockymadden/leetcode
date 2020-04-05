/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        boolean dupe = false;
        ListNode prev = head;
        ListNode iter = head.next;
        
        while (iter != null) {
            if (prev.val == iter.val) dupe = true;
            else {
                if (dupe) prev.next = iter;
            
                prev = iter;
                dupe = false;
            }
            
            iter = iter.next;
        }
    
        if (dupe) prev.next = null;
        
        return head;
    }
}