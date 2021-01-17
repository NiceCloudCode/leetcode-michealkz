package com.micheal.链表;

public class _206反转链表 {
        /**
         * 递归方式实现
         *
         * @param head
         * @return
         */
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        /**
         * 迭代的方式实现
         *
         * @param head
         * @return
         */
        public ListNode reverseList2(ListNode head) {
            ListNode newHead = null;
            while (head != null) {
                ListNode tmp = head.next;
                head.next = newHead;
                newHead = head;
                head = tmp;
            }
            return newHead;
        }
    public  void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        listNode5.next=listNode4;
        listNode4.next=listNode3;
        listNode3.next=listNode2;
        listNode2.next=listNode1;
        listNode1.next=null;

    }
}
