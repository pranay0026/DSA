class Solution {
    public ListNode reverseKGroup(ListNode head,int k) {
        Stack<ListNode> st=new Stack<>();
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode temp=curr;
            int count=0;

            while(count<k&&temp!=null){
                temp=temp.next;
                count++;
            }

            if(count<k){
                if(prev!=null){
                    prev.next=curr;
                }
                break;
            }

            count=0;
            while(count<k){
                st.push(curr);
                curr=curr.next;
                count++;
            }

            while(!st.isEmpty()){
                if(prev==null){
                    head=st.pop();
                    prev=head;
                }
                else{
                    prev.next=st.pop();
                    prev=prev.next;
                }
            }
        }

        if(prev!=null&&curr==null){
            prev.next=null;
        }

        return head;
    }
}