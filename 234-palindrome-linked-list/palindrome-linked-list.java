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
    public boolean isPalindrome(ListNode head) {
        // List<Integer> list=new ArrayList<>();
        
        // while(head!=null){
        //     list.add(head.val);
        //     head=head.next;
        // }
        // int l=0,r=list.size()-1;
        // while(l<r){
        //     if(!list.get(l).equals(list.get(r))){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;

        if (head == null || head.next == null) {
            return true;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare first and reversed second half
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
}