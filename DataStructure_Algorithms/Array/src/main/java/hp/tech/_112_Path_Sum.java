package hp.tech;

import java.util.Stack;

public class _112_Path_Sum {
    public static void main(String[] args) {

    }
    /*https://leetcode.com/problems/path-sum/*/


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return duyet(root, targetSum, 0);
        }


        public boolean duyet(TreeNode node, int targetSum, int currentSum) {
            if (node == null) return false;
            currentSum += node.val;

            if (isLeaf(node)) {
                return targetSum == currentSum;
            }



            boolean resultLeft = duyet(node.left, targetSum, currentSum);
            boolean resultRight = duyet(node.right, targetSum, currentSum);
            return resultRight || resultLeft;


        }
        public boolean isLeaf(TreeNode node) {
            return node.left == null && node.right == null;
        }
    }
}
