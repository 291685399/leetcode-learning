package com.wyj.array.twoSum;

/**
 * 两数之和测试类
 *
 * @author wyj
 * @create 2019-05-11 09:00
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
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
        int[] sumArray = solution.twoSum(nums, target);

        //打印处理之后的结果
        System.out.print("[");
        for (int x = 0; x < sumArray.length; x++) {
            System.out.print(sumArray[x]);
            if (x != sumArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
