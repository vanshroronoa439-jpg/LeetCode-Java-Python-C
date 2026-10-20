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
        int carry=0;
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode ans = new ListNode(-1);
        ListNode curr=ans;
        int num1=0,num2=0,sum=0,place=1;
        while(c1!=null && c2!=null){
            curr.next=new ListNode((c1.val+c2.val+carry)%10);
            curr=curr.next;
            carry=(c1.val+c2.val+carry)/10;
            c1=c1.next;
            c2=c2.next;
        }
        while(c1!=null){
            curr.next=new ListNode((c1.val+carry)%10);
            curr=curr.next;
            carry=(c1.val+carry)/10;
            c1=c1.next;
        }
        while(c2!=null){
            curr.next=new ListNode((c2.val+carry)%10);
            curr=curr.next;
            carry=(c2.val+carry)/10;
            c2=c2.next;
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
        return ans.next;
    }
}