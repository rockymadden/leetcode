public class Solution1474 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteNodes(ListNode head, int m, int n) {
        int M = m, N = n;
        ListNode bridge = head, iter = head;

        while (iter != null) {
            if (M > 1) {
                iter = iter.next;
                M--;
            } else if (M == 1) {
                bridge = iter;
                iter = iter.next;
                bridge.next = null;
                M--;
            } else if (N > 1) {
                iter = iter.next;
                N--;
            } else if (N == 1) {
                iter = iter.next;
                bridge.next = iter;
                M = m;
                N = n;
            }
        }

        return head;
    }
}
