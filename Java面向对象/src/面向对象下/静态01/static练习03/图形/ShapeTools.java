package 面向对象下.静态01.static练习03.图形;

/*声明图形工具类ShapeTools
- 提供静态方法public static int compare(Shape s1, Shape s2)如果s1的面积大于、小于、等于s2的面积，分别返回正整数、负整数和0。
- 提供静态方法public static boolean equals(Shape s1, Shape s2)比较两个图形的面积和周长是否都相等
- 提供静态方法public static void sort(Shape[] arr)可以给所有图形按照面积从小到大排序，如果面积相同的按照周长从小到大排序
- 提供静态方法public static void print(Shape[] arr)可以遍历输出所有图形信息
*/

public class ShapeTools {
    public static int compare(Shape s1, Shape s2) {
        return s1.area() > s2.area() ? 1 : s1.area() == s2.area() ? 0 : -1;
    }

    public static boolean equals(Shape s1, Shape s2) {
        return s1.area() == s2.area() && s1.perimeter() == s2.perimeter();
    }

    public static void sort(Shape[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                boolean flag = false;
                if (arr[j].area() > arr[j + 1].area()) {
                    flag = true;
                } else if (arr[j].area() == arr[j + 1].area()) {
                    if (arr[j].perimeter() > arr[j + 1].perimeter()) {
                        flag = true;
                    }
                }
                if (flag) {
                    Shape temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
