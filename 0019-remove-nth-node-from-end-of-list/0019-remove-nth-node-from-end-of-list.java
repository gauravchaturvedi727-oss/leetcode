/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }
        int position = length - n;
        if (position == 0) {
            return head.next;
        }
        current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}