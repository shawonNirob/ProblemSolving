class Solution {
    public ArrayList<Integer> range = new ArrayList<>();
    
    public Solution(ListNode head) {
        while (head != null) {
            range.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int pick =(int)(Math.random() * range.size());
        return range.get(pick);
    }
}
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
