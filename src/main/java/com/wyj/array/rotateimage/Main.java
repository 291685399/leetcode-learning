package com.wyj.array.rotateimage;

/**
 * 测试旋转图像
 *
 * @author wyj
 * @create 2019-05-10 09:00
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        solution.rotate(matrix);
    }
}
