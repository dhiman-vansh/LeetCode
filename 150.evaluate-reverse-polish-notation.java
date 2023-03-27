import java.util.Stack;

/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        int a, b;
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (String c : tokens) {
            System.out.println(" C is " + c);
            if (c.equals("+")) {
                System.out.println("In addition");
                b = st.pop();
                a = st.pop();
                res = a + b;
                st.push(res);
            } else if (c.equals("-")) {
                b = st.pop();
                a = st.pop();
                res = a - b;
                st.push(res);
            } else if (c.equals("*")) {
                b = st.pop();
                a = st.pop();
                res = a * b;
                st.push(res);
            } else if (c.equals("/")) {
                b = st.pop();
                a = st.pop();
                res = a / b;
                st.push(res);
            } else {
                // try {
                st.push(Integer.parseInt(c));
                System.out.println("Added " + c);
                // } catch (NumberFormatException e) {
                // System.out.println(e + " is error");
                // }

            }
        }
        return st.pop();
    }
}
// @lc code=end
