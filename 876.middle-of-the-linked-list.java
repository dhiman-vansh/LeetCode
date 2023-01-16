/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
 */

// @lc code=start
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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        if (head == null)
            return null;
        int i = 1;
        while (head.next != null) {
            i++;
            head = head.next;
        }
        for (int j = 0; j < (i) / 2; j++) {
            temp = temp.next;
        }
        return temp;
    }
}
// @lc code=end
