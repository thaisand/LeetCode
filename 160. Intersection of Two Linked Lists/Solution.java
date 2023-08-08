
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = new ListNode(0);
        head1.next = headA;
        ListNode head2 = new ListNode(0);
        head2.next = headB;
        while(head1.next != null) {
            if(head2.next != )
        }

    }
}

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }