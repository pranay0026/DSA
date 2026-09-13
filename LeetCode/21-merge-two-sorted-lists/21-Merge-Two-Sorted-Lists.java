class Solution {
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy=new ListNode();
        ListNode l3=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                l3.next=list1;
                list1=list1.next;
            }
            else{
                l3.next=list2;
                list2=list2.next;
            }
            l3=l3.next;
        }
        if(list1!=null){
            l3.next=list1;
            list1=list1.next;
        }
        if(list2!=null){
            l3.next=list2;
            list2=list2.next;
        }
        return dummy.next;
    }
}