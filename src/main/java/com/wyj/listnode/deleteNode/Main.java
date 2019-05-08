package com.wyj.listnode.deleteNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除链表测试类
 *
 * @author wyj
 * @create 2019-05-08 14:00
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 9};
        ListNode head = new ListNode(arr[0]);
        ListNode first = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode nextHead = new ListNode(arr[i]);
            first.next = nextHead;
            first = nextHead;
        }
        ListNode node = head.next;
        //测试
        Solution solution = new Solution();
        solution.deleteNode(node);
        //打印结果
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
    }
}
