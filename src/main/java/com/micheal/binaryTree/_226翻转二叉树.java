package com.micheal.binaryTree;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode-solution/
 * 方法一：递归
 * 思路与算法
 * <p>
 * 这是一道很经典的二叉树问题。
 * 显然，我们从根节点开始，递归地对树进行遍历，并从叶子结点先开始翻转。
 * 如果当前遍历到的节点 root 的左右两棵子树都已经翻转，
 * 那么我们只需要交换两棵子树的位置，即可完成以root 为根节点的整棵子树的翻转。
 * <p>
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class _226翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 交换左右子树
        TreeNode tmpnode = root.left;
        root.left = root.right;
        root.right = tmpnode;

        // 递归交换左节点
        invertTree(root.left);
        // 递归交换右节点
        invertTree(root.right);

        return root;
    }
}
