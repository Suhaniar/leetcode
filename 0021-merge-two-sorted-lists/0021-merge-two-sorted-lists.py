class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        cur1 = list1
        cur2 = list2
        dummy = ListNode(0)
        temp = dummy
        
        while cur1 and cur2:
            if cur1.val < cur2.val:
                temp.next = cur1
                cur1 = cur1.next
            else:
                temp.next = cur2
                cur2 = cur2.next # FIXED: Move cur2, not cur1
            temp = temp.next
        
        # FIXED: Move this outside the loop to attach the remaining nodes
        if cur1:
            temp.next = cur1
        else:
            temp.next = cur2
            
        return dummy.next
