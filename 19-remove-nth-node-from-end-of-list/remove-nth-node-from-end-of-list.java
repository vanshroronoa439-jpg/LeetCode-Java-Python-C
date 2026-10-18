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
        ListNode l=head;
        int len=0;
        while(l!=null){
            l=l.next;
            len++;
        }
        ListNode temp=new ListNode(-1,head);
        ListNode current=temp;
        for(int i=1;i<=len-n;i++){
            if(current.next==null)return head;
            current=current.next;
        }
        current.next=current.next.next;
        return temp.next;
    }
}