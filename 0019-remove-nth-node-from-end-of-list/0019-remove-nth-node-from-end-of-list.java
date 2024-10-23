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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int p=l-n;
        if(p==0){
            return head.next;
        }else{
            temp=head;
        for(int i=0;i<p-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
        }
    }
}
