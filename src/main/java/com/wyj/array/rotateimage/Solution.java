package com.wyj.array.rotateimage;

/**
 * 旋转图像具体实现
 *
 * @author wyj
 * @create 2019-05-10 09:00
 */
public class Solution {
    public void rotate(int[][] matrix) {
        //打印旋转之前的结果
        System.out.println("[");
        for (int j = 0; j < matrix.length; j++) {
            System.out.print("  [");
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k]);
                if (k != matrix[j].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");

        //旋转
        int temp = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix[i].length - 1 - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }

        //打印旋转之后的结果
        System.out.println("[");
        for (int j = 0; j < matrix.length; j++) {
            System.out.print("  [");
            for (int k = 0; k < matrix[j].length; k++) {
                System.out.print(matrix[j][k]);
                if (k != matrix[j].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}
