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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Step 1: Reverse the list
        head = reverse(head);

        // Step 2: Delete nth node from beginning
        if (n == 1) {
            head = head.next;
        } else {
            ListNode temp = head;

            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        // Step 3: Reverse again
        head = reverse(head);

        return head;
    }
}