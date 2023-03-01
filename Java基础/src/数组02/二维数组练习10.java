package 数组02;

/**
 * 使用二维数组打印一个 10 行杨辉三角.
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3  1
 * 1 4 6  4  1
 * 1 5 10 10 5 1
 * ....
 * 开发提示
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素.
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class 二维数组练习10 {
    public static void main(String[] args) {
        int[][] yangHui = new int[10][];

        for (int i = 0; i < yangHui.length; i++) {

            yangHui[i] = new int[i + 1];

            yangHui[i][0] = yangHui[i][i] = 1;

            if (i >= 2) {
                for (int j = 1; j < yangHui[i].length - 1; j++) {
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                }
            }
        }

        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
