package com.wyj.listnode.isPalindrome;

/**
 * 回文链表测试类
 *
 * @author wyj
 * @create 2019-05-08 14:00
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        ListNode head = new ListNode(arr[0]);
        ListNode first = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode nextNode = new ListNode(arr[i]);
            first.next = nextNode;
            first = nextNode;
        }
        //测试
        Solution solution = new Solution();
        boolean flag = solution.isPalindrome(head);
        System.out.println("是否为回文；" + flag);
    }
}
