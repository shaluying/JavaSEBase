package 面向对象下.静态01.static练习03.图形;

/*在测试类中，
- 创建两个矩形r1（2,3）,r2（3,6），创建2个三角形t1(3,4,5）,t2（6,6,6)，
- 调用compare方法比较r1和t1，
- 调用equals方法比较r2和t2，
- 创建Shape数组中，把上面4个对象放到数组中，调用就sort方法排序，在排序前后调用print方法遍历显示信息
*/

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(3, 6);
        Triangle t1 = new Triangle(3, 4, 5);
        Triangle t2 = new Triangle(6, 6, 6);

        System.out.println(ShapeTools.compare(r1, t2));
        System.out.println(ShapeTools.compare(r1, t1));
        System.out.println(ShapeTools.equals(r2, t2));

//        Shape[] arrShape = new Shape[4];
//        arrShape[0] = r1;
//        arrShape[1] = r2;
//        arrShape[2] = t1;
//        arrShape[3] = t2;
        Shape[] arrShape = {r1, r2, t1, t2};

        ShapeTools.print(arrShape);
        System.out.println();
        ShapeTools.sort(arrShape);
        ShapeTools.print(arrShape);


    }
}
