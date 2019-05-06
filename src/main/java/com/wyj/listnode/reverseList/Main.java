package com.wyj.listnode.reverseList;

/**
 * 反转链表测试类
 *
 * @author wyj
 * @create 2019-05-06 20:22
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode first = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode nextHead = new ListNode(arr[i]);
            first.next = nextHead;
            first = nextHead;
        }
        Test test = new Test();
        ListNode reverseHead = test.reverseList(head);
        while (reverseHead != null) {
            System.out.println("reverseHead:" + reverseHead.val);
            reverseHead = reverseHead.next;
        }
    }
}
