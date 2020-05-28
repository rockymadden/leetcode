/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution328 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode oddRoot = odd;
        ListNode evenRoot = even;
        boolean isOdd = false;

        while (head != null) {
            isOdd = !isOdd;

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
        }

        odd.next = evenRoot.next;

        return oddRoot.next;
    }
}
