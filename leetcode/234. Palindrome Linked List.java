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
        
        List<Integer> nums = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            nums.add(curr.val);
            curr=curr.next;
        }
        List<Integer> reverseNums = new ArrayList<>();
        
        for(int i=nums.size()-1; i>=0; i--){
            reverseNums.add(nums.get(i));
        }
        
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) != reverseNums.get(i)){
                return false;
            }
        }
        
        return true;
    }
}
