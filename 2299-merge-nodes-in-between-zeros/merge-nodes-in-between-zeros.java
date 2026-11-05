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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=new ListNode(-1);
        ListNode res=temp;
        int sum=0;
        ListNode current=head.next;
        while(current!=null){
            if(current.val==0){
                ListNode newNode = new ListNode(sum);
                res.next=newNode;
                res=res.next;
                sum=0;
            }
            else{
                sum+=current.val;
            }
            current=current.next;
        }
        return temp.next;
    }
}