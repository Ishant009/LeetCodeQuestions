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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode nodehead = node;
        int carry =0;
        while(l1!=null || l2!=null || carry!=0){
            int sum =0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2 !=null){
                sum+= l2.val;
                l2= l2.next;
            }
            sum+=carry;
            if(sum>=10) carry=1;
            else carry =0;
            node.next =  new ListNode(sum%10);
            node = node.next;
        }
        return nodehead.next;
    }
}