package com.wyj.array.rotatearray;

/**
 * 旋转数组具体实现
 *
 * @author wyj
 * @create 2019-05-10 09:18
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        //打印旋转数组之前的结果
        System.out.print("[");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
            if (j != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        int temp = 0;
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }

        //打印旋转数组之后的结果
        System.out.print("[");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
            if (j != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
