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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode revHead = reverseHead(slow.next);
        ListNode curr = head;
        while(revHead !=null){
            if(curr.val != revHead.val) return false;
            curr = curr.next;
            revHead = revHead.next;
        }
        return true;
    }
    ListNode reverseHead(ListNode head){
        ListNode prev= null;
        ListNode next =null;
        ListNode curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}