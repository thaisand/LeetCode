
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode aux = head;
        int tam = 0;

        while (aux != null) {
            aux = aux.next;
            tam++;
        }

        aux = head;
        tam = (tam/2);

        for (int i = 0; i < tam; i++) {
            aux = aux.next;
        }

        return aux;
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