package com.wyj.listnode.isPalindrome;

import java.util.Stack;

/**
 * 回文链表具体实现
 *
 * @author wyj
 * @create 2019-05-08 14:00
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        //设置快节点、慢节点，当循环结束的时候，slow刚好到中间（如果节点个数为奇数也是），fast刚好到最后一个节点（如果节点个数为偶数）或者最后一个的前一个节点（如果节点个数为奇数）
        while(fast!=null && fast.next!=null) {
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        //让慢节点跳过中间元素
        if(fast!=null){
            slow=slow.next;
        }
        //比较节点
        while(slow!=null) {
            if(stack.pop()!=slow.val) {
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
}
