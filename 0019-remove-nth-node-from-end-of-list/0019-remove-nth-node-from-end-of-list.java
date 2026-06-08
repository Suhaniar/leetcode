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

        // Reverse the list
        head = reverse(head);

        // Delete nth node from beginning
        if (n == 1) {
            head = head.next;
        } else {

            ListNode temp = head;
            int count = 1;

            while (count < n - 1) {
                temp = temp.next;
                count++;
            }

            temp.next = temp.next.next;
        }

        // Reverse again
        head = reverse(head);

        return head;
    }
}