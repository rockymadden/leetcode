/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution1290 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int getDecimalValue(ListNode list) {
        ListNode tmp;
        ListNode head = null;
        int ans = 0;
        int i = 0;

        while (list != null) {
            tmp = list.next;
            list.next = head;
            head = list;
            list = tmp;
        }

        while (head != null) {
            ans ^= (head.val << i++);
            head = head.next;
        }

        return ans;
    }
}
