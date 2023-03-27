/*
 * @lc app=leetcode id=110 lang=cpp
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution
{
public:
    int maxDepth(TreeNode *root)
    {

        if (root == NULL)
            return 0;

        int ldepth = maxDepth(root->left);
        int rdepth = maxDepth(root->right);

        if (ldepth >= rdepth)
            return ldepth + 1;
        else
            return rdepth + 1;
    }

public:
    bool isBalanced(TreeNode *root)
    {
        bool res = true;
        int lheight, rheight;
        if (root == NULL)
            return true;
        else if (root->left != NULL && root->right != NULL)
        {
            lheight = maxDepth(root->left);
            rheight = maxDepth(root->right);
        }
        else if (root->left == NULL && root->right != NULL)
        {
            lheight = 0;
            rheight = maxDepth(root->right);
        }
        else if (root->right == NULL && root->left != NULL)
        {
            lheight = 0;
            rheight = maxDepth(root->left);
        }
        else if (root->right == NULL && root->left == NULL)
            return true;
        if (lheight - rheight >= -1 && lheight - rheight <= 1)
        {
            res = true;
        }
        else
        {
            cout << " diff is " << lheight - rheight;
            res = false;
        }
        cout << lheight << rheight << " diff is " << lheight - rheight;

        return res;
    }
};
// @lc code=end
