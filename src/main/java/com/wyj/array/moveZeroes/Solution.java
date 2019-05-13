package com.wyj.array.moveZeroes;

/**
 * 移动零测试类
 *
 * @author wyj
 * @create 2019-05-11 09:00
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        //打印处理之前的结果
        System.out.print("[");
        for (int x = 0; x < nums.length; x++) {
            System.out.print(nums[x]);
            if (x != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        //处理
        int temp = 0;
        int flag = nums.length - 1;
        int i = 0;
        while (flag > 0 && i < flag) {
            if (nums[i] == 0) {
                for (int j = i; j < flag; j++) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                flag--;
            } else {
                i++;
            }
        }

        //打印处理之后的结果
        System.out.print("[");
        for (int y = 0; y < nums.length; y++) {
            System.out.print(nums[y]);
            if (y != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
