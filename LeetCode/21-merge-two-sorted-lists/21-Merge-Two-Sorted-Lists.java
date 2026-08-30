class Solution {
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode head;
        ListNode head1=list1;
        ListNode head2=list2;

        if(head1.val<=head2.val){
            head=head1;
            head1=head1.next;
        }
        else{
            head=head2;
            head2=head2.next;
        }

        ListNode curr=head;

        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                curr.next=head1;
                head1=head1.next;
            }
            else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }

        if(head1!=null) curr.next=head1;
        else curr.next=head2;

        return head;
    }
}