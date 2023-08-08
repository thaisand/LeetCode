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
            int tam = 0; 
            ListNode copy = head; 
            while(copy != null) {
                copy = copy.next;
                tam++;
            }
            copy = head; 
            
            


            System.out.println(tam);

            
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        int n = 2;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}