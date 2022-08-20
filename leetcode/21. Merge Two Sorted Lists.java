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
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode damiNode =new ListNode(-101);
        ListNode head = damiNode;
        ListNode curr;
           
        while(list1 !=null && list2 != null){
                if(list1.val == list2.val){
                    curr = new ListNode(list1.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list1 = list1.next;
                    
                    curr = new ListNode(list2.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list2 = list2.next;
                }
                else if(list1.val < list2.val){
                    curr = new ListNode(list1.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list1 = list1.next;
                }else{
                    curr = new ListNode(list2.val);
                    damiNode.next = curr;
                    damiNode = damiNode.next;
                    list2 = list2.next;
                }   
            }
        
        if(list1 != null) damiNode.next = list1;
        if(list2 != null) damiNode.next = list2;
        
        return head.next;
    }
}
//Resursive
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}



//O(1) space
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-101);
        ListNode curr = head;
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = (list1 == null) ? list2 : list1;
        
        return head.next;
    }
}




