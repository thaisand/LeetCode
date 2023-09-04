
// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode right = new ListNode(); 
        ListNode current = right = head;

        while(current != null) {
            right = current.next;
            current.next = left; 
            left = current;
            current = right;
        }

        return left;
    }
}