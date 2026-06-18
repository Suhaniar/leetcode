class Solution{
    public static ListNode rotateRight(ListNode head,int k){

        if(head==null||head.next==null||k==0)return head;
        ListNode tail=head;
        int n=1;
        while(tail.next!=null){
            tail=tail.next;
            n++;
        }
         k=k%n;
        if(k==0)return head;
        tail.next=head;
        
        ListNode newtail=head;
        
        int stepstonewtail=n-k;
        
        for(int i=1;i<stepstonewtail;i++){
            newtail=newtail.next;
        }
        ListNode newHead=newtail.next;
        newtail.next=null;
        return newHead;
        
    }

}
    
   
