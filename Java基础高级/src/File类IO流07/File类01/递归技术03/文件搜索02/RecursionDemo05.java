package File类IO流07.File类01.递归技术03.文件搜索02;

import java.io.File;
import java.io.IOException;

/*
    需求：文件搜索、从C:盘中，搜索出某个文件名称并输出绝对路径。
        分析：
        先定位出的应该是一级文件对象
        遍历全部一级文件对象，判断是否是文件
        如果是文件，判断是否是自己想要的
        如果是文件夹，需要继续递归进去重复上述过程

 */
public class RecursionDemo05 {
    public static void main(String[] args) {

        searchFile(new File("C:"), "鲁大师");
    }

    /**
     * 根据文件名称到相应的目录中寻找
     *
     * @param dir      被搜索的源目录
     * @param fileName 被搜索的源文件夹
     */
    public static void searchFile(File dir, String fileName) {
        //1，判断传进来的dir目录是否是文件夹
        if (dir != null && dir.isDirectory()) {
            //是文件夹 可以开始流程

            //2，获取当前文件夹的所有一级文件对象
            File[] files = dir.listFiles();

            //3，判断获取的所有文件对象是否是null或者是空内容（计算机的某些文件夹需要特殊权限才可以访问）
            if (files != null && files.length > 0) {
                //files有内容

                //4，遍历files
                for (File file : files) {
                    //5，遍历到文件就判断是否是自己想要的
                    if (file.isFile()) {
                        if (file.getName().contains(fileName)) {
                            System.out.println("您要找的可能是：" + file.getName() + "——>" + file.getAbsolutePath());
                        }
                    } else { //6，遍历到文件夹就用递归重复搜索文件夹
                        searchFile(file, fileName);
                    }
                }
            }

        } else {
            System.out.println(dir.getName() + "并不是一个文件夹！");
        }
    }
}
