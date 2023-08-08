/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resp = new ListNode();
        ListNode headR = resp;
        if (list1 == null) {
            headR = list2;
        } else if (list2 == null) {
            headR = list1;
        } else {
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    resp.next = list1;
                    list1 = list1.next;
                } else if (list2.val < list1.val) {
                    resp.next = list2;
                    list2 = list2.next;
                } else {
                    resp.next = list1;
                    list1 = list1.next;
                    resp = resp.next;
                    resp.next = list2;
                    list2 = list2.next;
                }
                resp = resp.next;
            }
        }
        return headR;
    }

}

class ListNode {
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