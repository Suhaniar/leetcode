class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # 1. Base case: If list has 0, 1, or 2 nodes, no change needed
        if not head or not head.next:
            return head
        
        odd = head
        even = head.next
        evenhead = even # Save this to connect later
        
        # 2. The leapfrog logic
        while even and even.next:
            odd.next = even.next
            odd = odd.next
            
            even.next = odd.next
            even = even.next
            
        # 3. Connect the end of the odd list to the start of the even list
        odd.next = evenhead
        
        return head