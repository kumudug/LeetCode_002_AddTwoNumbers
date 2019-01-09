package com.company;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.

        Input: (9) + ([1 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9 -> 9])
        */

        /*
        ListNode L1 = new ListNode(2);
        L1.next = new ListNode(4);
        L1.next.next = new ListNode(3);

        ListNode L2 = new ListNode(5);
        L2.next = new ListNode(6);
        L2.next.next = new ListNode(4);
        */

        ListNode L1 = new ListNode(9);

        ListNode L2 = new ListNode(1);
        L2.next = new ListNode(9);
        L2.next.next = new ListNode(9);
        L2.next.next.next = new ListNode(9);
        L2.next.next.next.next = new ListNode(9);
        L2.next.next.next.next.next = new ListNode(9);
        L2.next.next.next.next.next.next = new ListNode(9);
        L2.next.next.next.next.next.next.next = new ListNode(9);
        L2.next.next.next.next.next.next.next.next = new ListNode(9);
        L2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode result = solution.addTwoNumbers(L1, L2);

        System.out.println("abc");
    }
}
