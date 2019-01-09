package com.company;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getResultList(l1,l2, new ListNode(0), 0);
    }

    private ListNode getResultList(ListNode l1, ListNode l2, ListNode head, int carryOver) {

        if(l1 == null && l2 == null) {
            if(carryOver > 0) {
                head.val = carryOver;
                return head;
            } else {
                return null;
            }
        }

        if(l1 != null) {
            head.val += l1.val;
        }

        if(l2 != null) {
            head.val += l2.val;
        }

        head.val += carryOver;

        if(head.val > 9){
            carryOver = head.val / 10;
            head.val = head.val % 10;
        } else {
            carryOver = 0;
        }

        if(carryOver > 0 || (l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
            head.next = getResultList(l1 != null ? l1.next : null, l2 != null ? l2.next : null, new ListNode(0), carryOver);
        }

        return head;
    }
}
