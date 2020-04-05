/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static int length(ListNode list) {
        if (list == null) return 0;
        
        int n = 0;
        
        while (list != null) {
            n++;
            list = list.next;
        }
        
        return n;
    }
    
    public ListNode sortList(ListNode list) {
        int n = length(list);
        
        if (n < 2) return list;
        
        return sortList(list, n);
    }
    
    private static ListNode sortList(ListNode list, int n) {
        if (n < 2) return list;
            
        ListNode a = list;
        ListNode b = list;
        ListNode z;
        
        int i = 1;
        int mid = (n / 2) + (n % 2);

        while (i <= mid) {
            z = b;
            b = b.next;
            if (++i > mid) z.next = null;
        }

        if (n > 2) {
            a = sortList(a, (n / 2) + (n % 2));
            b = sortList(b, n  / 2);
        }
        
        if (b == null || a.val <= b.val) {
            z = a;
            a = a.next;
        } else {
            z = b;
            b = b.next;
        }
        list = z;
        
        while (a != null || b != null) {
            if (b == null ? true : a == null ? false : a.val <= b.val) {
                list.next = a;
                a = a.next;
            } else {
                list.next = b;
                b = b.next;
            }
            
            list = list.next;
        }
        
        return z;
    }
}