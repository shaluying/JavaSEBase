package File类IO流07.大作业03.删除文件夹03.删除整个文件夹;

/*
windows操作系统中可以进行文件夹的删除,比如删除E:\\to\\day11文件夹,
但是java没有提供直接删除文件夹的方法。
请编写程序实现文件夹的删除
 */

import java.io.File;

public class Test {
    public static void main(String[] args) {
        deleteDirectory("D:\\Program Files\\ModifiableWindowsApps");
//        deleteDirectory("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）\\基础加强阶段练习题参考（参考练习，偏难，可做上课案例，可不做此练习）\\IO1_作业\\05");
    }

    public static void deleteDirectory(String path) {
        File file = new File(path);
        if (file.exists()) {

            if (file.isFile()) {
                file.delete();
                return;
            }

            if (file.isDirectory()) {
                File[] files = file.listFiles();

                if (files.length == 0) {
                    file.delete();
                    return;
                } else {
                    for (File file1 : files) {
                        deleteDirectory(file1.getAbsolutePath());
                    }
                }
            }

            file.delete();

        } else {
            System.out.println("路径不存在！");
        }
    }

}
