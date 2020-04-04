/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode list) {
        if (list == null || list.next == null) return list;

        ListNode tmp;
        ListNode head = null;
        
        while (list != null) {
            tmp = list.next;
            list.next = head;
            head = list;
            list = tmp;
        }
        
        return head;
    }
}