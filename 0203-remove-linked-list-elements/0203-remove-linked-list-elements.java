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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head!=null && head.val == val){
            head = head.next;
            if(head == null) return null;
        }
        ListNode slow = head;
        while(slow.next !=null){
            if(slow.next.val == val){
                slow.next = slow.next.next;
            }else{
                slow = slow.next;
            }
        }
        return head;
    }
}