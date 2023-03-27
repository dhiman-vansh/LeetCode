/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        // int i = 0;
        int out = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' ||
                    c[i] == '6' || c[i] == '7' || c[i] == '8' || c[i] == '9' || c[i] == '0') {
                // System.out.println("res is " + res);
                out = (out * 10) + (int) c[i];
                System.out.println(c[i] + " is added to " + out);
                // i++;
            }
            // else if (c[i] == '-') {
            // res *= -1;
            // // i++;
            // }
        }
        return;
    }
}
// @lc code=end
