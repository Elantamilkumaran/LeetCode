// Last updated: 1/8/2026, 3:33:30 PM
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
    ListNode* middleNode(ListNode* head) {
        int c=0;
        struct ListNode* temp=head;
        struct ListNode* temp2=head;
        while(temp!=NULL){
            c++;
            temp=temp->next;
        }
        int ch=c/2;
        for(int i=0;i<ch;i++){
            temp2=temp2->next;
        }
        return temp2;
    }
};