package IO流二08.练习07.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    第五题
        文本替换几乎是所有文本编辑器都支持的功能,
        但是要限制在编辑器中才能够执行该功能。
        现在需要通过java代码替换指定文本文件中的指定内容的功能。
    需求：
        把指定文件中的指定内容全部替换为新的内容

    实现步骤：
        1、创建Scanner对象
        2、获取文件路径,要查找的文本及替换后的文本
        3、创建StringBuilder对象
        4、创建文件字符输入流对象
        5、字符数组循环读写
        6、把读取到的多个字符的内容拼接到StringBuilder对象中
        7、关闭资源
        8、StringBuilder对象转换为String对象调用replace方法,完成替换
        9、创建文件字符输出流对象
        10、把替换后的内容重新写入到文件中
        11、关闭资源
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //1、创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //2、获取文件路径,要查找的文本及替换后的文本
        System.out.println("请输入要进行替换操作的文件路径: ");
        String filePath = sc.nextLine();
        System.out.println("请输入要查找的文本: ");
        String findStr = sc.nextLine();
        System.out.println("请输入替换后的文本: ");
        String replaceStr = sc.nextLine();

        //3、创建StringBuilder对象
        StringBuilder sb = new StringBuilder();

        //4、创建文件字符输入流对象
        FileReader fr = new FileReader(filePath);

        //5、字符数组循环读写
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            //6、把读取到的多个字符的内容拼接到StringBuilder对象中
            sb.append(chs,0,len);
        }

        //7、关闭资源
        fr.close();

        //8、StringBuilder对象转换为String对象调用replace方法,完成替换
        String newStr = sb.toString().replace(findStr, replaceStr);

        //9、创建文件字符输出流对象
        FileWriter fw = new FileWriter(filePath);

        //10、把替换后的内容重新写入到文件中
        fw.write(newStr);

        //11、关闭资源
        fw.close();
    }
}
