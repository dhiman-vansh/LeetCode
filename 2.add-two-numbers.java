import java.lang.FdLibm.Pow;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * long val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        int carry = 0;
        ListNode head = res;
        while (l1 != null && l2 != null) {
            ListNode temp = new ListNode(((l1.val + l2.val) + carry) % 10);
            System.out.println("Addition is " + temp.val);
            res.next = temp;
            if (l1.val + l2.val + carry >= 10) {
                carry = 1;
            } else
                carry = 0;
            l2 = l2.next;
            l1 = l1.next;
            res = res.next;
        }
        while (l1 != null) {
            res.next = new ListNode((l1.val + carry) % 10);
            System.out.println(l1.val + carry + "is ");
            if (l1.val + carry >= 10) {
                carry = 1;
            } else
                carry = 0;
            res = res.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            res.next = new ListNode((l2.val + carry) % 10);
            if (l2.val + carry >= 10) {
                carry = 1;
            } else
                carry = 0;
            res = res.next;
            l2 = l2.next;
        }
        if (carry == 1) {
            res.next = new ListNode(1);
        }
        return head.next;
    }
}
// @lc code=end
