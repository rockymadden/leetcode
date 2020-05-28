/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    var currA = headA;
    var currB = headB;
    
    while(currA != currB) {
        currA = currA ? currA.next : headB;
        currB = currB ? currB.next : headA;
    }
    
    return currA;
};