class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode temp=l3;
        int sum=0,carry=0;
        while(l1!=null || l2!=null){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
        }
        if(carry>0) temp.next=new ListNode(carry);
        return l3.next;
    }
}