package com.micheal.链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * 方法一：迭代
 * 假设链表为 1→2→3→∅，我们想要把它改成 ←1←2←3。
 * <p>
 * 在遍历链表时，将当前节点的、next 指针改为指向前一个节点。
 * 由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。
 * 在更改引用之前，还需要存储后一个节点。最后返回新的头引用。
 */
public class _206反转链表 {
//    public ListNode reverseList1(ListNode head) {
//
//    }


    /**
     * 递归的方式实现反转链表
     */
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head.next;
        ListNode newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
