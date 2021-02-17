package com.micheal.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树翻转
 * 可以采用前序遍历、中序遍历、后续遍历、层序遍历的方式进行二叉树的翻转
 * https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class _226_ReverseBinaryTree {

    // 前序遍历的方式翻转二叉树
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) return root;
    //     // 将左右节点交换位置
    //     TreeNode tmp = root.left;
    //     root.left = root.right;
    //     root.right = tmp;
    //
    //     // 左子节点
    //     invertTree(root.left);
    //     // 右子节点
    //     invertTree(root.right);
    //
    //     return root;
    // }

    // 中序遍历的方式翻转二叉树
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) return root;
    //     // 左子节点
    //     invertTree(root.left);
    //
    //     // 将左右节点交换位置
    //     TreeNode tmp = root.left;
    //     root.left = root.right;
    //     root.right = tmp;
    //
    //     // 右子节点
    //     invertTree(root.left);
    //
    //     return root;
    // }

    // 后续遍历的方式翻转二叉树
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) return root;
    //
    //     invertTree(root.left);
    //     invertTree(root.right);
    //
    //     // 将左右节点交换位置
    //     TreeNode tmp = root.left;
    //     root.left = root.right;
    //     root.right = tmp;
    //
    //     return root;
    // }


    // 层序遍历的方式翻转二叉树
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return root;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
}
