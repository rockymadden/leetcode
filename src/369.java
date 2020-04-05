/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        if (head == null) return head;

        ListNode tmp;
        ListNode rev = null;
        int carry = 1;
        
        while (head != null) {
            tmp = head.next;
            head.next = rev;
            rev = head;
            head = tmp;
        }
        
        head = rev;
        rev = null;
        
        while (head != null) {
            if (carry == 1) {
                carry = (head.val + 1) / 10;
                head.val = (head.val + 1) % 10;
            }
            
            tmp = head.next;
            head.next = rev;
            rev = head;
            head = tmp;
        }
        
        if (carry == 1) {
            tmp = new ListNode(1);
            tmp.next = rev;
            rev = tmp;
        }
        
        return rev;
    }
}