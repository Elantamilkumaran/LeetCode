// Last updated: 1/8/2026, 3:32:18 PM
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        ListNode* temp=head;
        ListNode* prev=head;
        ListNode* nxt=head;
        int n=1;
        while(temp->next!=NULL){
            temp=temp->next;
            n++;
        }
        if(n==1){
            head=NULL;
            return head;
        }
        for(int i=1;i<=n/2;i++){
            prev=nxt;
            nxt=nxt->next;
        }
        prev->next=nxt->next;
        return head;
    }
};