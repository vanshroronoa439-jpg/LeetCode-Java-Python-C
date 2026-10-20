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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode ans = new ListNode(-1);
        ListNode curr=ans;
        int sum=0,carry=0;
        while(c1!=null && c2!=null){
            sum=c1.val+c2.val+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            c1=c1.next;
            c2=c2.next;
        }
        while(c1!=null){
            sum=c1.val+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            c1=c1.next;
        }
        while(c2!=null){
            sum=c2.val+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            c2=c2.next;
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
        return ans.next;
    }
}