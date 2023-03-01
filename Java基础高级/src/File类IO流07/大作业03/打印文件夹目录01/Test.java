package File类IO流07.大作业03.打印文件夹目录01;

/*
windows资源管理器中会展示目录中的内容结构,但是java并没有提供展示目录结构的操作,
本案例完成按照指定格式打印文件夹的目录结构(包含子文件夹和文件),效果如下图:
 */

import java.io.File;

public class Test {
    public static void main(String[] args) {
        printDirectoryInfo("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）\\基础加强阶段练习题参考（参考练习，偏难，可做上课案例，可不做此练习）\\IO1_作业");

    }

    private static void printDirectoryConstruction(String path, String s) {
        File file = new File(path);

        File[] files = file.listFiles();

        if (files != null) {
            s += "   ";
            for (File file1 : files) {
                System.out.println(s + "|->" + file1.getName());
                printDirectoryConstruction(file1.getAbsolutePath(), s);
            }
        }

    }

    private static void printDirectoryInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println(file.getName());
            String s = "";
            printDirectoryConstruction(path, s);
        } else {
            System.out.println("路径不存在！");

        }

    }
}