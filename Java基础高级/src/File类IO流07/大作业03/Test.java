package File类IO流07.大作业03;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）\\基础加强阶段练习题参考（参考练习，偏难，可做上课案例，可不做此练习）\\IO1_作业");

        File file1 = new File(file,"jj");

        System.out.println(file1.getAbsolutePath());

        System.out.println(file1.exists());

        file1.mkdir();

    }
}
