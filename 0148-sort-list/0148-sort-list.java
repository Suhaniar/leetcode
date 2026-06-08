class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null) return null;

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(arr);

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.val = arr.get(i++);
            temp = temp.next;
        }

        return head;
    }
}