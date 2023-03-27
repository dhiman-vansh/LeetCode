import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> f = new ArrayList<List<Integer>>();
        // int[] temp ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int z = j; z < nums.length; z++) {
                    if (nums[i] + nums[j] + nums[z] == 0 && i != j && j != z) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[z]);
                        // System.out.println("adding " + temp);
                        if (!f.contains(temp))
                            f.add(temp);
                    }
                }
            }
        }
        return f;

    }
}
// @lc code=end
