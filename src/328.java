/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;

        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddFirst = odd;
        ListNode evenFirst = even;
        boolean isOdd = true;
        
        while (head != null) {
            if (isOdd) {
                odd.next = head;
                odd = odd.next;
                head = head.next;
                odd.next = null;
            } else {
                even.next = head;
                even = even.next;
                head = head.next;
                even.next = null;
            }
            
            isOdd = !isOdd;
        }
        
        odd.next = evenFirst.next;
                
        return oddFirst.next;
    }
}