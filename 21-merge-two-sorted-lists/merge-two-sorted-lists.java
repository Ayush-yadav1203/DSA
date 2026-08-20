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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // List<Integer> list=new ArrayList<>();
        // while(list1!=null){
        //     list.add(list1.val);
        //     list1=list1.next;
        // }
        // while(list2!=null){
        //     list.add(list2.val);
        //     list2=list2.next;
        // }

        // Collections.sort(list);
        // ListNode head =new ListNode(0);
        // ListNode temp=head;
        // int i=0;
        // for(int num:list){
        //     temp.next=new ListNode(num);
        //     temp=temp.next;
        // }
        // return head.next;

        ListNode dummy= new ListNode();
        ListNode tail=dummy;
        while(list1 !=null && list2 !=null){
            if(list1.val<list2.val){
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }else{
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
        }
        tail.next=(list1!=null) ? list1:list2;
        return dummy.next;
    }
}