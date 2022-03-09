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
        ListNode prev = null;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            ListNode nex = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nex;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second.next!=null){
            ListNode nex1 = first.next;
            first.next = second;
            first = nex1;
          
            ListNode nex2 = second.next;
            second.next = first;
            second = nex2;
        }
    }
}
