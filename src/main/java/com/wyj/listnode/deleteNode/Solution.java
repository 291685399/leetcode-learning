package com.wyj.listnode.deleteNode;

/**
 * node本身为链表head中的一个节点，不必关心head链表怎么操作
 *
 * @author wyj
 * @create 2019-05-08 14:00
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
