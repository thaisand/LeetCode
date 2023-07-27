class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String list1 = new String();
        String list2 = new String();
        ListNode head1 = new ListNode();
        head1.next = l1;
        ListNode head2 = new ListNode();
        head2.next = l2;
        while (l1 != null) {
            list1 += Integer.toString(l1.val);
            l1 = l1.next;
        }
        System.out.println("list1 = " + list1);
        while (l2 != null) {
            list2 += Integer.toString(l2.val);
            l2 = l2.next;
        }
        System.out.println("list2 = " + list2);
        list1 = reverseString(list1);
        list2 = reverseString(list2);
        long int1 = Long.parseLong(list1);
        long int2 = Long.parseLong(list2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        long sum = int1 + int2;
        System.out.println("sum = " + sum);
        char[] strSum = Long.toString(sum).toCharArray();
        ListNode head = new ListNode();
        ListNode resp = head;
        for (int i = strSum.length - 1; i >= 0; i--) {
            if (i != 0) {
                resp.next = new ListNode();
                resp.val = Character.getNumericValue(strSum[i]);
                resp = resp.next;
            } else {
                resp.val = Character.getNumericValue(strSum[i]);
            }

        }
        return head;
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}