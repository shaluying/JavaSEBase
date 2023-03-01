package File类IO流07.大作业03.计算文件夹的大小02;

import java.io.File;
import java.util.Scanner;

/*
    第三题
        在windows操作系统中可以查看文件夹的大小,直接右键文件夹/属性,如下图:
        但是在java中没有提供直接查看文件夹大小的操作,请使用File类和IO流的相关知识,计算文件夹的大小。
        要求通过键盘录入文件夹路径(必须保证该文件夹路径是存在的)

    实现步骤:
        1、定义获取文件夹大小的方法getSize
            1.1、定义long类型变量size,累加长度,初始值0
            1.2、方法参数File类型对象dir,调用listFiles方法,获取File对象数组files
            1.3、判断如果数组files为null或者长度为0,直接返回size
            1.4、遍历File对象数组files
            1.5、 判断如果当前File对象是文件,把文件大小累加到变量size中
            1.6、 判断如果当前File对象是文件夹,递归调用getSize方法,传递当前File对象做参数,并把方法返回结果累加到size中
            1.7 、循环结束返回size
        2、创建File对象dir,代表存在的文件夹
        3、调用获取文件夹大小的方法getSize,传递File对象dir,获取文件夹大小
        4、输出文件夹大小
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2、创建File对象dir,代表存在的文件夹
        System.out.println("请输入一个存在的文件夹路径: ");
        String path = sc.nextLine();

        File dir = new File(path);

        //3、调用获取文件夹大小的方法getSize,传递File对象dir,获取文件夹大小
        long size = getSize(dir);

        //4、输出文件夹大小
        System.out.println("大小: "+size+" 字节");
    }
    //1、定义获取文件夹大小的方法getSize
    public static long getSize(File dir) {
        //1.1、定义long类型变量size,累加长度,初始值0
        long size = 0;

        //1.2、方法参数File类型对象dir,调用listFiles方法,获取File对象数组files
        File[] files = dir.listFiles();

        //1.3、判断如果数组files为null或者长度为0,直接返回size
        if (files == null || files.length == 0) {
            return size;
        }

        //1.4、遍历File对象数组files
        for (File file : files) {
            //1.5、 判断如果当前File对象是文件,把文件大小累加到变量size中
            if (file.isFile()) {
                size += file.length();
            }
            //1.6、 判断如果当前File对象是文件夹,递归调用getSize方法,传递当前File对象做参数,并把方法返回结果累加到size中
            if (file.isDirectory()) {
                size += getSize(file);
            }
        }

        //1.7 、循环结束返回size
        return size;
    }
}
