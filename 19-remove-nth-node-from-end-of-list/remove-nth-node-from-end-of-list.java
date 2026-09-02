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
        ListNode newlist=new ListNode(0);
        ListNode temp=newlist;
        ListNode cur=head;
        int total=0;
        while(cur!=null){
            total++;
            cur=cur.next;
        }
        int c=0;

        while(head!=null){
            c++;
            if(c!=total-n+1){
                temp.next=new ListNode(head.val);
                temp=temp.next;
            }
            head=head.next;
        }
        return newlist.next;
    }
}