/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;
            
        int index;
        int i = 0;
        ListNode ans = head;
        ListNode prev = head;
        
        while (head != null) {
            i++;
            head = head.next;
        }
        
        index = i - n + 1; // Add one for front padding.
        i = 0;
        head = new ListNode(-1);
        head.next = ans;
        ans = head;
                
        while (true) {
            if (i++ == index) {
                prev.next = head.next;
                break;
            }
            
            prev = head;
            head = head.next;
        }
        
        return ans.next;
    }
}