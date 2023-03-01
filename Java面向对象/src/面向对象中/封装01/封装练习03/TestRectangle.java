package 面向对象中.封装01.封装练习03;

/*测试类的main中创建一个可以装3个矩形对象的数组，
并调用set方法为对象的属性赋值，依次长是8,7,6，宽是2,3,4
- 遍历输出矩形对象数组
- 按照矩形对象的length属性值从小到大排序后，遍历输出矩形对象数组
- 按照矩形对象的面积从小到大排序后，遍历输出矩形对象数组
*/
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] arrRec = new Rectangle[3];
        for (int i = 0; i < arrRec.length; i++) {
            arrRec[i] = new Rectangle();
            arrRec[i].setLength(8 - i);
            arrRec[i].setWidth(2 + i);
            System.out.println(arrRec[i].getInfo());
        }

        System.out.println("按length排序");
        for (int i = 1; i < arrRec.length; i++) {
            for (int j = 0; j < arrRec.length - i; j++) {
                if (arrRec[j].getLength() > arrRec[j + 1].getLength()) {
                    Rectangle temp = arrRec[j];
                    arrRec[j] = arrRec[j + 1];
                    arrRec[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrRec.length; i++) {
            System.out.println(arrRec[i].getInfo());
        }

        System.out.println("按area排序");
        for (int i = 1; i < arrRec.length; i++) {
            for (int j = 0; j < arrRec.length - i; j++) {
                if (arrRec[j].area() > arrRec[j + 1].area()) {
                    Rectangle temp = arrRec[j];
                    arrRec[j] = arrRec[j + 1];
                    arrRec[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrRec.length; i++) {
            System.out.println(arrRec[i].getInfo());
        }


    }
}
