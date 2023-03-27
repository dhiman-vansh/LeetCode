import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
        // for (Integer i : st1) {
        // st2.push(i);
        // }
        int temp = st2.pop();
        // st1.clear();
        while (!st2.empty()) {
            st1.push(st2.pop());
        }
        // for (Integer i : st2) {
        // st1.push(i);
        // }
        return temp;
    }

    public int peek() {
        while (!st1.empty()) {
            st2.push(st1.pop());
        }
        int temp2 = st2.peek();
        while (!st2.empty()) {
            st1.push(st2.pop());
        }
        return temp2;
    }

    public boolean empty() {
        // for (Integer i : st1) {
        // System.out.println(i);
        // }
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end
