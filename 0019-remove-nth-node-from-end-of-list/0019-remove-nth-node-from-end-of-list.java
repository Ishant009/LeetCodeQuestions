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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null || head.next== null) return null;
        int i=0;
        ListNode temp = head;
        ListNode temp1 = head;
        while(temp!=null){
            if(i>=n+1){
                temp1= temp1.next;
            }
            i++;
            temp= temp.next;
        }
        if(i==n) return head.next;
        // System.out.println(temp1.val);
        if(temp1.next!=null){
        temp1.next = temp1.next.next;
        }
        return head;
    }
}