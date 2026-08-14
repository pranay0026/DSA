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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode prev=s;
        while(f!=null && f.next!=null){
            f=f.next.next;
            prev=s;
            s=s.next;
        }
        System.out.println(prev.val);
        System.out.println(s.val);
        prev.next=s.next;
        return head;
    }
}