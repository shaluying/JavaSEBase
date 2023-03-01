package 面向对象中.多态03.大作业07.各种员工;

/*在测试类中创建员工数组，并存储
1个普通员工对象，2个程序员对象，1个架构师对象，1个设计师对象
*/

public class Test {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        Employee emp = new Employee(1, "段誉", 22, 3000);
        Programmer pgm1 = new Programmer(3, "任我行", 23, 7000);
        Programmer pgm2 = new Programmer(4, "张三丰", 24, 7300);
        Architect arc = new Architect(2, "令狐冲", 32, 18000, 15000, 2000);
        Designer des = new Designer(5, "周芷若", 28, 10000, 5000);

        empArr[0] = emp;
        empArr[1] = pgm1;
        empArr[2] = pgm2;
        empArr[3] = arc;
        empArr[4] = des;

        for (int i = 0; i < empArr.length; i++) {
            System.out.println(empArr[i].getInfo());
        }

    }
}
