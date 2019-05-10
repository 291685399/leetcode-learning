package com.wyj.array.rotatearray;

/**
 * 测试旋转数组
 *
 * @author wyj
 * @create 2019-05-10 09:18
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(nums, k);
    }
}
