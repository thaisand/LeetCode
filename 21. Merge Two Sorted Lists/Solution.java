class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resp = new ListNode();
        ListNode head = resp;
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    resp.next = list1;
                    list1 = list1.next;
                } else if (list1.val > list2.val) {
                    resp.next = list2;
                    list2 = list2.next;
                } else {
                    resp.next = list1;
                    list1 = list1.next;
                } 
                resp = resp.next;
            }
            if(list1 != null) {
              resp.next = list1;
            }
            if(list2 != null) {
              resp.next = list2;
            }
        }
        return head.next;
    }
}
