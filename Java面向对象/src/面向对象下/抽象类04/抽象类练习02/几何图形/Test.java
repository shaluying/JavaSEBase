package 面向对象下.抽象类04.抽象类练习02.几何图形;

/*
在测试类中，
- 创建两个矩形（2,3）,（3,6），创建2个三角形(3,4,5）,（6,6,6)，
- 创建Shape数组中，把上面4个对象放到数组中，遍历显示信息
*/

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(3, 6);
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(6, 6, 6);

        Shape[] shapes = new Shape[4];
        shapes[0] = r1;
        shapes[1] = r2;
        shapes[2] = t1;
        shapes[3] = t2;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

    }
}
