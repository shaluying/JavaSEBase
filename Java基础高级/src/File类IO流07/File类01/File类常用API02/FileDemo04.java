package File类IO流07.File类01.File类常用API02;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/*

    目标：File针对目录的遍历
    - public String[] list()：
         获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
    - public File[] listFiles()(常用)：
         获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）

     listFiles方法注意事项：
        当文件不存在时或者代表文件时，返回null
        当文件对象代表一个空文件夹时，返回一个长度为0的数组
        当文件对象是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
        当文件对象是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        当没有权限访问该文件夹时，返回null

 */
public class FileDemo04 {
    public static void main(String[] args) {
        // 1、定位一个目录
        File f1 = new File("D:/resources");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 2.一级文件对象
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getPath());
            System.out.println(f.getName());
            System.out.println(f.length());
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f.lastModified()));
        }

        // 注意事项
        File dir = new File("D:/resources/ddd");
        File[] files1 = dir.listFiles();
        System.out.println(Arrays.toString(files1));
    }
}
