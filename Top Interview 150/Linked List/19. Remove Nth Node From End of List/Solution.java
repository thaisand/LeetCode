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
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode aux = head; 
        ListNode dummy = new ListNode();
        dummy.next = aux;
        int tam = 0;
        while(aux != null) {
            aux = aux.next; 
            tam++;
        }
        if(tam == 1) {
            return null;
        }
        if(n > tam) {
            n = n % tam;
        }
        aux = head; 
        if (n == tam) {
            aux = aux.next;
            return aux;
        } 
        for(int i = 0; i < tam; i++) {
            if(i == tam - n - 1) {
                aux.next = aux.next.next; 
                i++;
            } else if ((n == 1) && (i == tam - 2)) {
                aux.next = null;
                return dummy.next;
            }
            aux = aux.next;
        }
        return dummy.next;
    }
}