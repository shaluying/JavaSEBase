package File类IO流07.大作业03.计算文件夹的大小02;

/*
在windows操作系统中可以查看文件夹的大小,直接右键文件夹/属性,如下图:
但是在java中没有提供直接查看文件夹大小的操作,请使用File类和IO流的相关知识,计算文件夹的大小。
要求通过键盘录入文件夹路径(必须保证该文件夹路径是存在的)
 */

import java.io.File;

public class Test {
    public static long totalSize = 0;

    public static void main(String[] args) {
        getSize("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）");
        System.out.println(totalSize);
    }

    public static void getSize(String path) {
        File file = new File(path);

        File[] files = file.listFiles();

        if (files != null) {
            for (File file1 : files) {
                getSize(file1.getAbsolutePath());
            }
        } else {
            totalSize += file.length();
        }

    }

}
