package com.wyj.listnode.reverseList;

/**
 * 反转链表迭代方式具体实现
 *
 * @author wyj
 * @create 2019-05-06 20:00
 */
public class Test {
    public ListNode reverseList(ListNode head) {
        ListNode reverseHead = null;
        while (head != null) {
            ListNode second = head.next; //获取当前链表元素下一个节点
            head.next = reverseHead; //将head放到新链表头节点的头部
            reverseHead = head; //移动新链表的头指针，让它始终指向新链表头部
            head = second; //将head传递给下一个链表元素
        }
        return reverseHead;
    }
}