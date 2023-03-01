package 面向对象中.多态03.大作业07.男人女人类;

/*周末一群男男女女相亲，在测试类创建不同对象放在Person[]数组中，

- 遍历数组，自我介绍，
- 再次遍历数组，调用吃饭方法
- 吃完饭，最后遍历数组，都去上厕所，男的上完厕所抽烟，女的上完厕所补妆。
*/

public class Test {
    public static void main(String[] args) {
        Person[] peo = new Person[6];
        Man m0 = new Man("张三", 30, "经理");
        Man m1 = new Man("李四", 28, "主管");
        Man m2 = new Man("王五", 25, "职工");
        Woman wm0 = new Woman("赵花", 28, "组长");
        Woman wm1 = new Woman("张容", 26, "文员");
        Woman wm2 = new Woman("刘莉", 24, "护士");

        peo[5] = m0;
        peo[2] = m1;
        peo[4] = m2;
        peo[1] = wm0;
        peo[3] = wm1;
        peo[0] = wm2;

        for (int i = 0; i < peo.length; i++) {
            System.out.println(peo[i].getInfo());
        }
        System.out.println();
        for (int i = 0; i < peo.length; i++) {
           peo[i].eat();
        }
        System.out.println();
        for (int i = 0; i < peo.length; i++) {
            System.out.println("上完厕所后：");
            if (peo[i] instanceof Man){
                ((Man)peo[i]).smoke();
            }
            if (peo[i] instanceof Woman){
                ((Woman)peo[i]).makeup();
            }
        }

    }
}
