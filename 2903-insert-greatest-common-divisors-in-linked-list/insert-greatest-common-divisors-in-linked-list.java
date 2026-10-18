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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)return head;
        ListNode c1=head;
        while(c1.next!=null){
            int num=gcd(c1.val,c1.next.val);
            ListNode temp=new ListNode(num);
            temp.next=c1.next;
            c1.next=temp;
            c1=c1.next.next;
        }
        return head;
    }
    public int gcd(int n1,int n2){
        if(n2==0)return n1;
        if(n1==0)return n2;
        return gcd(n2,n1%n2);
    }
}