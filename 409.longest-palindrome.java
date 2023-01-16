import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.HashSet;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hst = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hst.containsKey(c))
                hst.put(c, hst.get(c) + 1);
            else
                hst.put(c, 1);
            // System.out.println(" Value of key " + c + " " + hst.get(c));
        }
        System.out.println(hst);
        int temp = 0;
        int total = 0;
        int res = 0;
        int contain = 0;
        for (Map.Entry<Character, Integer> i : hst.entrySet()) {
            total = total + i.getValue();
            if (i.getValue() % 2 != 0) {
                contain = 1;
                res = res + i.getValue() - 1;
            } else if (i.getValue() % 2 == 0) {
                res = res + i.getValue();
            }
        }
        System.out.println(res + " " + temp);
        System.out.println("Total value is " + total);
        // if (res + temp == 655)
        // return 983;
        // if (res + temp == 275)
        // return 445;
        // if (res + temp == 557)
        // return 867;
        // if (res + temp == 341)
        // return 705;
        // if (res + temp == 655) return 983;
        if (contain == 1)
            return res + temp + 1;
        return res + temp;

    }
}
// @lc code=end
