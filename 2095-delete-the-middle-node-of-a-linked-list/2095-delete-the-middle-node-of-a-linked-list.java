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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int middle = count / 2;
        int i = 0;
        while(current.next != null){
            if(i == middle){
                current.next = current.next.next;
                break;
            }
            i++;
            current = current.next;
        }
        return dummy.next;
    }
}