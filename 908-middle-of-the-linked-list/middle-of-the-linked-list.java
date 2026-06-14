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
    public ListNode middleNode(ListNode head) {
        // ListNode temp=head;
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast !=null && fast.next != null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return slow;
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int mid = list.size() / 2;

        while (mid-- > 0) {
            head = head.next;
        }

        return head;
    }
}