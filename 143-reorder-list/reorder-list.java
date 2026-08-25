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
    public void reorderList(ListNode head) {
       
       ListNode slow = head;
       ListNode fast = head;
        ListNode temp =null;
        ListNode rev = null;
       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
    //    if(fast!=null) slow = slow.next;
    ListNode second = slow.next;
    slow.next = null;
       while(second!=null){
           temp = second;
            second = second.next;
            temp.next = rev;
            rev = temp;        
       }
      
       ListNode move = head;
       while(rev!=null){
        ListNode temp1 = move.next;
        ListNode temp2 = rev.next;

        move.next = rev;
        rev.next = temp1;

        move = temp1;
        rev = temp2;
       }
    }
}