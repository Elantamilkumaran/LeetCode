// Last updated: 1/8/2026, 3:33:16 PM
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
    int getDecimalValue(ListNode* head) {
        ListNode* temp=head;
        string s="";
        while(temp!=NULL){
            s+=to_string(temp->val);
            temp=temp->next;
        }
        return stoi(s,NULL,2);
    }
};