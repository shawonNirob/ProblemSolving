/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
        struct ListNode* newNode =head;
    
        int length=0;
        while(newNode != NULL){
            newNode=newNode->next;
            length++;
        }
        if(length==n){
            return head->next;
        }
        length =length-n-1;
        newNode=head;
        while(length>0){
            newNode=newNode->next;
            length--;
        }
        newNode->next=newNode->next->next;
        
        return head;
    }
