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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
       
        ListNode temp=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=temp;
            if(temp!=null){
                temp=temp.next;
            }
        }
        head=prev;
        return head;
    }
}
        // ListNode curr = head;
        // ListNode prev = null;
        // while(curr!=null){
        //     ListNode next =curr.next;
        //     curr.next =prev;
        //     prev=curr;
        //     curr=next;               simpler version
        // }
        // return prev;