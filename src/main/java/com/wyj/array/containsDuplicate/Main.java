package com.wyj.array.containsDuplicate;

/**
 * 存在重复测试类
 *
 * @author wyj
 * @create 2019-05-11 14:00
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Solution solution = new Solution();

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
        boolean f = solution.containsDuplicate(nums);

        //打印结果
        System.out.println(f);
    }
}
