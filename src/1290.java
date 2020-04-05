/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
//     public void show(ListNode head) {
//         while (head != null) {
//             System.out.print(head.val + " -> ");
//             head = head.next;
//         }
        
//         System.out.println("null");
//     }
    
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