package com.micheal.链表;

public class _237删除链表中的节点 {
    public static void main(String[] args) {
        class Solution {
            public void deleteNode(ListNode node) {
                node.val = node.next.val;
                node.next = node.next.next;
            }
        }
    }
}
